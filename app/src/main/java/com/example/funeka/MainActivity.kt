package com.example.funeka

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDetailedView: Button = findViewById(R.id.buttonDetailedView)
        buttonDetailedView.setOnClickListener {
            startActivity(Intent(this, DetailedViewActivity::class.java))
        }

        val buttonClearData: Button = findViewById(R.id.buttonClearData)
        buttonClearData.setOnClickListener {
            // Code to clear data
        }
    }
}
