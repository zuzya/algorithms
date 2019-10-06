package me.zuzya.homework.first

import java.io.File

fun main(args : Array<String>) {

    var file = File("input.txt")
    file.readLines().forEach{

        println("line: $it")
        var split = it.split(" ")

        var result = split[0].toLong() + split[1].toLong()
        println(result)

        File("output.txt").writeText(result.toString())
    }





}