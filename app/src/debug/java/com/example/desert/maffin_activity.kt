package com.example.desert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class maffin_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maffin)
        supportActionBar?.hide()
    }
}