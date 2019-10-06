package me.zuzya.homework.first

import me.zuzya.sort.Bag
import me.zuzya.sort.swap
import java.io.File

class Sort {

    fun main(args: Array<String>) {

        var file = File("input.txt")


        var lines = file.readLines()
        var n = lines[0]
        var array = lines[1].split(" ").map { it.toInt() }

        var bag = Bag(array.toTypedArray())
        sort(bag)

        File("output.txt").printWriter().use { out ->

            out.println(bag.indexes)
            out.println(bag.toString())
        }
    }

    fun sort(bag: Bag) {

        println("before $bag")

        var indexes: ArrayList<Int> = ArrayList()
        var growing: ArrayList<Int> = ArrayList()

        val array = bag.array
        for (j in 1 until array.size) {

            var i = j - 1
            var digitCurrent = array[j]

            var flag = false
            while (i >= 0 && array[i] > array[i + 1]) {

                flag =  true
                swap(array, i, i + 1)
                i--
            }
            if(flag){
                growing.add(digitCurrent)
                println("grow ${toStr(growing)}")
                flag = false
            }


            indexes.add(array.indexOf(digitCurrent) + 1)
        }

        bag.indexes = indexes
        println("indexes ${toStr(indexes)}")
        println("after $bag")
    }

    private fun swap(array: ArrayList<Int>, i: Int, j: Int) {

        val tmp = array[i]
        array[i] = array[j]
        array[j] = tmp
    }

    fun toStr(array: ArrayList<Int>): String {
        return array.joinToString(" ")
    }
}