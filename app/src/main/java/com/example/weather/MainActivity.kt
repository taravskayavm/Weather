package com.example.weather

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin_test.lesson1.City

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        City (temperature=15, name="NewName").test()
        JavaTestNew().foo()

    }
}
class  JavaTestNew:JavaTest() {
    fun foo():Int {
        return i;
    }

}