package com.example.kotlin_test.lesson1

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.example.weather.JavaTest
import com.example.weather.KotlinTest
import kotlin.jvm.internal.Intrinsics.Kotlin

internal open class City constructor(
    val cityName: String = "defaultName",
    var temperature: Int = 15
) {

    fun test(testParam: String = "Stroka") {
        testParam2 = "Stroka2"
        val testParam3 = testParam2
        val javaText: JavaTest = JavaTest()

    }

    var p = ""
        get() {
            return field
        }
        set(p0: String) {
            field = p0
        }


    lateinit var testParam2: String //TODO Int примитив (127)


    constructor (name: String, temperature: Int, descr: String) : this(name, temperature) {
    }

    constructor (name: String, temperature: Int, descr1: String, descr2: String) : this(
        name,
        temperature,
        descr1
    ) {
    }

    constructor(
        name: String,
        temperature: Int,
        descr1: String,
        descr2: String,
        descr3: String
    ) : this(name, temperature, descr1, descr2) {
    }
}


internal class CityName(name: String, temperature: Int) : City(), View.OnClickListener {
    override fun onClick(p0: View?) {
    }
}

class Button @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int? = null,
    defStyleRes: Int?
) {

}