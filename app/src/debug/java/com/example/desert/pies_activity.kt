package com.example.desert

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class pies_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pies)
        supportActionBar?.hide()
    }

    fun buttonOnClick(view: View) {
        val intent = Intent(this@pies_activity,pmechta_activity::class.java)
        startActivity(intent)
    }

    fun persik(view: View) {
        val intent = Intent(this@pies_activity,persik_activity::class.java)
        startActivity(intent)
    }

    fun vishn(view: View) {
        val intent = Intent(this@pies_activity,vishn_activity::class.java)
        startActivity(intent)
    }

    fun avocado(view: View) {
        val intent = Intent(this@pies_activity,avocado_activity::class.java)
        startActivity(intent)
    }

    fun mindal(view: View) {
        val intent = Intent(this@pies_activity,mindal_activity::class.java)
        startActivity(intent)
    }

    fun maffin(view: View) {}
}