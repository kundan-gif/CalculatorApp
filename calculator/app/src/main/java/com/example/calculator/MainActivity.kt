package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var lastNumeric: Boolean = false

    var lastDot: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onDigit(view:View){

        tvInput.append((view as Button).text)

        lastNumeric = true
    }
    fun onOperator(view:View){
        if (lastNumeric && !isOperatorAdded(tvInput.text.toString())) {
            tvInput.append((view as Button).text)
            lastNumeric = false
            lastDot = false
        }
    }
    fun onEqual(view:View){
        Toast.makeText(this,"Equal clicked",Toast.LENGTH_SHORT).show()
    }
    fun onClear(view:View){
        tvInput.text = ""
        lastNumeric = false
        lastDot = false
    }
    fun onDecimalPoint(view:View){
        if (lastNumeric && !lastDot) {
            tvInput.append(".")
            lastNumeric = false
            lastDot = true
        }
    }
    private fun isOperatorAdded(value: String): Boolean {

        return if (value.startsWith("-")) {
            false
        } else {
            (value.contains("/")
                    || value.contains("*")
                    || value.contains("-")
                    || value.contains("+"))
        }
    }
}