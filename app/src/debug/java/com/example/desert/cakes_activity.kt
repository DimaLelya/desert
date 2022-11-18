package com.example.desert

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class cakes_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cakes)
        supportActionBar?.hide()
    }

    fun buttonOnClick(view: View) {
        val intent = Intent(this@cakes_activity,mramor_activity::class.java)
        startActivity(intent)
    }

    fun prynichniy(view: View) {
        val intent = Intent(this@cakes_activity,prynichniy_activity::class.java)
        startActivity(intent)
    }

    fun smetannik(view: View) {
        val intent = Intent(this@cakes_activity,smetannik_activity::class.java)
        startActivity(intent)
    }

    fun snicers(view: View) {
        val intent = Intent(this@cakes_activity,snicers_activity::class.java)
        startActivity(intent)
    }

    fun tiramisu(view: View) {
        val intent = Intent(this@cakes_activity,tiramisu_activity::class.java)
        startActivity(intent)
    }
}