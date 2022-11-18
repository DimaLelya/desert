package com.example.desert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class pmechta_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pmechta)
        supportActionBar?.hide()
    }
}