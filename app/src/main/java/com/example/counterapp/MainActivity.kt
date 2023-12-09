package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textResult:TextView = findViewById(R.id.ResultText)
        val counterButton:Button = findViewById(R.id.CounterButton)
        var i:Int = 0;
        fun CounterFunction():Int = i++


        counterButton.setOnClickListener{
            CounterFunction();
            var updatedValue = i.toString();
            textResult.setText(updatedValue);
        }



    }
}