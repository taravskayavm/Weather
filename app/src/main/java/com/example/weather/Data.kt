package com.example.kotlin_test.lesson1

import android.view.View


data class Data(var cityName:String, var temperature:Int)


object Database {
    fun getTest():String {
        if (0==0) {
            return "test"
        } else {
            return "Nope"
        }

        val impl = object : View.OnClickListener{
            override fun onClick(v: View?) {

            }
        }
    }
}
