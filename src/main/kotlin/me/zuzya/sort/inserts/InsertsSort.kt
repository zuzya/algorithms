package me.zuzya.sort.inserts

import me.zuzya.sort.Bag
import me.zuzya.sort.Sorter
import me.zuzya.sort.swap

class InsertsSort : Sorter {

    override fun sort(bag: Bag) {

        println("before $bag")

        val array = bag.array
        for (j in 1 until array.size) {
            var i = j - 1
            while (i >= 0 && array[i] > array[i + 1]) {

                swap(array, i, i + 1)
                i--
            }
        }

        println("after $bag")
    }

}