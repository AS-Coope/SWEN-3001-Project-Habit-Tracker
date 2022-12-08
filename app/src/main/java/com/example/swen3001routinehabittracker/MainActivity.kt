package com.example.swen3001routinehabittracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        button1.setOnClickListener {
            val intent = Intent(this,CreateHabitScreen::class.java)
            startActivity(intent)
        }
        /* Button intent to go to the calendar view
        button2.setOnClickListener {
            val intent = Intent(this,CreateHabitScreen::class.java)
            startActivity(intent)
        }*/
    }
}