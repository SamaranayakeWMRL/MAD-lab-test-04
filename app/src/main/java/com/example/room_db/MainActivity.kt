package com.example.room_db

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val familyactivities_btn = findViewById<Button>(R.id.familyactivities)
        val dailyPlaner_btn = findViewById<Button>(R.id.dailyPlaner)
        val taskmanager_btn = findViewById<Button>(R.id.taskmanager)
        val reminders_btn = findViewById<Button>(R.id.reminders)
        val wellness_btn = findViewById<Button>(R.id.wellness)
        val importantdocuments_btn = findViewById<Button>(R.id.importantdocuments)
        val health_btn = findViewById<Button>(R.id.health)
        val office_btn = findViewById<Button>(R.id.office)

       familyactivities_btn.setOnClickListener {
            val intent = Intent(this, TodoActivity::class.java)
            startActivity(intent)  // Starts the SecondActivity
        }

        dailyPlaner_btn.setOnClickListener {
            val intent = Intent(this, TodoActivity::class.java)
            startActivity(intent)  // Starts the SecondActivity
        }

        taskmanager_btn.setOnClickListener {
            val intent = Intent(this, TodoActivity::class.java)
            startActivity(intent)  // Starts the SecondActivity
        }

        reminders_btn.setOnClickListener {
            val intent = Intent(this, TodoActivity::class.java)
            startActivity(intent)  // Starts the SecondActivity
        }

        wellness_btn.setOnClickListener {
            val intent = Intent(this, TodoActivity::class.java)
            startActivity(intent)  // Starts the SecondActivity
        }

        importantdocuments_btn.setOnClickListener {
            val intent = Intent(this, TodoActivity::class.java)
            startActivity(intent)  // Starts the SecondActivity
        }

        health_btn.setOnClickListener {
            val intent = Intent(this, TodoActivity::class.java)
            startActivity(intent)  // Starts the SecondActivity
        }

        office_btn.setOnClickListener {
            val intent = Intent(this, TodoActivity::class.java)
            startActivity(intent)  // Starts the SecondActivity
        }
    }

}