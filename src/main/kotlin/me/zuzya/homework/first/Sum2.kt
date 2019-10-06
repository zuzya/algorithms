package me.zuzya.homework.first

import java.io.File

fun main(args : Array<String>) {

    var file = File("input.txt")

    var input = ""
    file.readLines().forEach{

        println("line: $it")
        input = it
    }


    var split = input.split(" ")
    var a = split[0].toLong()
    var b = split[1].toLong()
    var result = a + b*b

    println(result)
    File("output.txt").writeText(result.toString())
}