package me.zuzya.sort

import java.util.*

class Bag(

        var array: Array<Int>


) {

    var indexes: ArrayList<Int>? = null

    override fun toString(): String {
        return array.joinToString(" ")
    }
}