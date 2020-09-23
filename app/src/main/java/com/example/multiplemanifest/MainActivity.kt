package com.example.multiplemanifest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var appId: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appId = findViewById(R.id.textApplicationId)

        appId.text = BuildConfig.APPLICATION_ID

    }
}
