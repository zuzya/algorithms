package me.zuzya.sort.inserts

import me.zuzya.sort.Bag
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class InsertsSortTest {

    val sorter: InsertsSort = InsertsSort()

    @Test
    internal fun testSort() {

        var bag = Bag(arrayOf(5, 2, 4, 6, 1, 3))

        sorter.sort(bag)

        val sorted = arrayOf(1, 2, 3, 4, 5, 6)
        assertEquals(Bag(sorted).toString(), bag.toString())
    }
}