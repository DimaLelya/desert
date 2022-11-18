package com.example.desert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class cartoshka_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cartoshka)
        supportActionBar?.hide()
    }
}