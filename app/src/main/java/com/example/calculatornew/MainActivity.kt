package com.example.calculatornew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun OnClickNumber(view:View)
    {
        val buselected = view as Button
        var currnumber = result.text.toString()
        if(check)
        {
            result.setText("")
        }
        check = false
        when(buselected.id)
        {
            bu1.id -> currnumber += "1"
            bu2.id -> currnumber += "2"
            bu3.id ->currnumber += "3"
            bu4.id -> currnumber += "4"
            bu5.id -> currnumber += "5"
            bu6.id -> currnumber += "6"
            bu7.id -> currnumber += "7"
            bu8.id -> currnumber += "8"
            bu9.id -> currnumber += "9"
            buDots.id -> currnumber += "."
        }
        result.setText(currnumber)
    }
    var operator = "*"
    var oldval = 0.0
    var check = true
    fun OnClickOperator(view:View)
    {
        val buselect = view as Button
        oldval = result.text.toString().toDouble()
        when(buselect.id)
        {
            buAdd.id -> operator = "+"
            buMinus.id -> operator = "-"
            buMul.id -> operator = "*"
            buDiv.id -> operator = "/"
        }
        result.setText(operator)
        check = true
    }
    fun OnClickEqual(view:View)
    {
        var newnumber = result.text.toString().toDouble()
        var total = 0.0
            when(operator)
        {
            "+" -> total = oldval + newnumber
            "-" -> total =  oldval + newnumber
            "*" -> total = oldval * newnumber
            "/" -> total = oldval / newnumber
        }
        result.setText(total.toString())
        check = true
    }
    fun OnClickClear(view: View)
    {
        result.setText("0")
        check = true
    }
    fun OnClickRoot(view: View)
    {
        var currnumber = result.text.toString().toDouble()
        result.setText(sqrt(currnumber).toString())
    }
}