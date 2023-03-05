package com.example.kotlin_test.lesson1


data class Data(var cityName:String, var temperature:Int)


object Database {
    fun getTest():String {
        if (0==0) {
            return "test"
        } else {
            return "Nope"
        }

    }
}
