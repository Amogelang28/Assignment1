package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ageNumber = findViewById<EditText>(R.id.ageNumber1)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btnClear)
        val txtResults = findViewById<TextView>(R.id.txtResults)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val results = when (age) {
                    in 0..12 -> "William Adelin"
                    in 13..19 -> "Raphael"
                    in 20..59 -> "Vincent van Gogh"
                    in 60..69 ->"Garry Shandling"
                    in 70.. 75 ->"Muhammed Ali"
                    in 79..80 ->"George Burns"
                    in 80..85 ->"Barbara Stanwyck"
                    in 89..95 ->"Harold Macmillan"
                    in 99..100 ->"Betty White"
                    in 100..105 ->"Kirk Douglas"
                    else -> "Senior"
                }
                txtResults.text = "Age: $age\n${
                    when (results) {
                        "William Adelin" -> "Died at the age of 12"
                        "Pop Smoke" -> "Died at the age of 19"
                        "Vincent van Gogh" -> "Died at the age of 37"
                        "Garry Shandling" -> "Died at the age of 66"
                        "Muhammed Ali" -> "Died at the age of 74"
                        "George Burns" -> "Died at the age of 79"
                        "Barbara Stanwyck" -> "Died at the age of "
                        "Harold Macmillan" -> "Died at the age 96"
                        "Betty White" -> "Died at the age of 99"
                        "Kirk Douglas" -> "Died at the age of 100"
                        else -> "You are a senior."
                    }
                }"
            } else {
                txtResults.text = "Please enter a valid age."
            }
        }
        btnCancel.setOnClickListener {
            ageNumber.text.clear()
        }
    }
}
