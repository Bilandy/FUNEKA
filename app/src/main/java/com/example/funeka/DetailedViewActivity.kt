package com.example.funeka

import android.annotation.SuppressLint

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailedViewActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        // Assume we have methods to get screen time data
        val averageScreenTime: Double = calculateAverageScreenTime()
        val textViewAverage: TextView = findViewById(R.id.textViewAverage)
        textViewAverage.text = "Average Screen Time: $averageScreenTime minutes"

        // Display detailed data
    }

    private fun calculateAverageScreenTime(): Double {
        // Calculate and return average screen time
        return 0.0
    }
}
