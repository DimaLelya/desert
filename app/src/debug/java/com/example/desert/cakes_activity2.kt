package com.example.desert

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class cakes_activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cakes2)
        supportActionBar?.hide()
    }

    fun zavarnoe(view: View) {
        val intent = Intent(this@cakes_activity2,zavarnoe_activity::class.java)
        startActivity(intent)
    }

    fun baunti(view: View) {
        val intent = Intent(this@cakes_activity2,baunti_activity::class.java)
        startActivity(intent)
    }

    fun cartoshka(view: View) {
        val intent = Intent(this@cakes_activity2,cartoshka_activity::class.java)
        startActivity(intent)
    }

    fun bushe(view: View) {
        val intent = Intent(this@cakes_activity2,bushe_activity::class.java)
        startActivity(intent)
    }

    fun delis(view: View) {
        val intent = Intent(this@cakes_activity2,delis_activity::class.java)
        startActivity(intent)
    }

}