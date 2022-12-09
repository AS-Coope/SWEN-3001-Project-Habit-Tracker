package com.example.swen3001routinehabittracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import android.widget.CalendarView.OnDateChangeListener

class CalendarViewScreen : AppCompatActivity() {
    lateinit var dateTV: TextView
    lateinit var calendarView: CalendarView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar_view_screen)

        // initializing variables of
        // list view with their ids.
        dateTV = findViewById(R.id.idTVDate)
        calendarView = findViewById(R.id.calendarView)

        // on below line we are adding set on
        // date change listener for calendar view.
        calendarView
            .setOnDateChangeListener(
                OnDateChangeListener { view, year, month, dayOfMonth ->
                    // In this Listener we are getting values
                    // such as year, month and day of month
                    // on below line we are creating a variable
                    // in which we are adding all the variables in it.
                    val Date = (dayOfMonth.toString() + "-"
                            + (month + 1) + "-" + year)

                    // set this date in TextView for Display
                    dateTV.setText(Date)
                })
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, CreateTaskScreen::class.java)
            startActivity(intent)
        }

    }
}
