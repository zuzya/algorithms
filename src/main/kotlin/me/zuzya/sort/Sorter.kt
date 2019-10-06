package me.zuzya.sort


fun swap(array: Array<Int>, i: Int, j: Int) {

    val tmp = array[i]
    array[i] = array[j]
    array[j] = tmp
}

interface Sorter {

    fun sort(bag: Bag)
}
