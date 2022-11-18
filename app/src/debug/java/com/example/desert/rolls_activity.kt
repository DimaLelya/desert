package com.example.desert

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class rolls_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rolls)
        supportActionBar?.hide()
    }

    fun ruletmac(view: View) {
        val intent = Intent(this@rolls_activity,ruletmac_activity::class.java)
        startActivity(intent)
    }

    fun nejenka(view: View) {
        val intent = Intent(this@rolls_activity,nejenka_activity::class.java)
        startActivity(intent)
    }

    fun ruloreh(view: View) {
        val intent = Intent(this@rolls_activity,ruloreh_activity::class.java)
        startActivity(intent)
    }

    fun prajskiy(view: View) {
        val intent = Intent(this@rolls_activity,prajskiy_activity::class.java)
        startActivity(intent)
    }

    fun smetsnniy(view: View) {
        val intent = Intent(this@rolls_activity,smetsnniy_activity::class.java)
        startActivity(intent)
    }
}