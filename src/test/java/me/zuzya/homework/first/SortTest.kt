package me.zuzya.homework.first

import org.junit.jupiter.api.Test
import java.io.File


class SortTest{

    @Test
    internal fun test() {

        File("input.txt").printWriter().use { out ->

            out.println("10")
            out.println("1 8 4 2 3 7 5 6 9 0")
        }
        var sort = Sort()
        var args = Array(1) {""}
        sort.main(args)
    }
}