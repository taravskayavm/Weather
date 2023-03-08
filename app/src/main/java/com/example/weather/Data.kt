package com.example.kotlin_test.lesson1

import android.util.Log


data class Data(var cityName: String, var temperature: Int)

enum class TestEnum {
    test1,
    test2,
    test3,
    test4
}

object Database {
    fun getTestCycle() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7)
        for (one in list) {
            Log.d("mylogs", "$one getTestCycle")
        }
        list.forEach {
            Log.d("mylogs", "$it getTestCycle")
        }

        list.forEach { one: Int ->
            Log.d("mylogs", "$one getTestCycle")
        }

        repeat(10) {
            Log.d("mylogs", "$it getTestCycle")
        }

        val test = 1..10
        for (i in 1..10) {
            Log.d("mylogs", "$i getTestCycle")
        }
        for (i in 1 until 10 step 2) {
            Log.d("mylogs", "$i getTestCycle")
        }
        for (i in 10 downTo 1 step 3) {
            Log.d("mylogs", "$i getTestCycle")
        }
        var counter = 10;
        while (counter-- > 0) {
            Log.d("mylogs", "$counter getTestCycle")
        }

        fun getTestIf(): String {

            val result = if (0 == 0) {
                val f1 = 1 + 23256
                val f2 = 1 + 23276
                val f3 = 1 + 2345
                "test"
            } else {
                "Nope"
            }

            try {

            } catch (e: Throwable) {

            } finally {
                //закрыть соединение с сервером
            }

            return result
        }

        fun getTestWhen(input: TestEnum): String {

            val result = when (input) {    //switch
                TestEnum.test1 -> "1"
                TestEnum.test2 -> "2"
                TestEnum.test3 -> "3"
                TestEnum.test4 -> "4"
            }

            return result
        }
    }
}