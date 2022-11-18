package com.example.desert

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class cupcakes_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cupcakes)
        supportActionBar?.hide()
    }

    fun maffin(view: View) {
        val intent = Intent(this@cupcakes_activity,maffin_activity::class.java)
        startActivity(intent)
    }

    fun vanil(view: View) {
        val intent = Intent(this@cupcakes_activity,vanil_activity::class.java)
        startActivity(intent)
    }

    fun oreh(view: View) {
        val intent = Intent(this@cupcakes_activity,oreh_activity::class.java)
        startActivity(intent)
    }

    fun rogdectvenskiy(view: View) {
        val intent = Intent(this@cupcakes_activity,rogdectvenskiy_activity::class.java)
        startActivity(intent)
    }

    fun tvorogniy(view: View) {
        val intent = Intent(this@cupcakes_activity,tvorogniy_activity::class.java)
        startActivity(intent)
    }
}