package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onDigit(view:View){
        Toast.makeText(this,"Digit clicked",Toast.LENGTH_SHORT).show()
    }
    fun onOperator(view:View){
        Toast.makeText(this,"Operator clicked",Toast.LENGTH_SHORT).show()
    }
    fun onEqual(view:View){
        Toast.makeText(this,"Equal clicked",Toast.LENGTH_SHORT).show()
    }
    fun onClear(view:View){
        Toast.makeText(this,"Clear clicked",Toast.LENGTH_SHORT).show()
    }
    fun onDecimalPoint(view:View){
        Toast.makeText(this,"Decimal clicked",Toast.LENGTH_SHORT).show()
    }
}