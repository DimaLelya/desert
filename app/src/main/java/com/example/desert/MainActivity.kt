package com.example.desert

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }

    fun buttonOnClick(view: View) {
        val intent = Intent(this@MainActivity,cakes_activity::class.java)
        startActivity(intent)

    }

    fun pies(view: View) {
        val intent = Intent(this@MainActivity,pies_activity::class.java)
        startActivity(intent)
    }

    fun cupcakes(view: View) {
        val intent = Intent(this@MainActivity,cupcakes_activity::class.java)
        startActivity(intent)
    }

    fun cakes(view: View) {
        val intent = Intent(this@MainActivity,cakes_activity2::class.java)
        startActivity(intent)
    }

    fun rolls(view: View) {
        val intent = Intent(this@MainActivity,rolls_activity::class.java)
        startActivity(intent)
    }

}