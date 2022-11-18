package com.example.desert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class tvorogniy_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tvorogniy)
        supportActionBar?.hide()
    }
}