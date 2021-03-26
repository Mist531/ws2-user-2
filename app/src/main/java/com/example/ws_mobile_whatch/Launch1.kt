package com.example.ws_mobile_whatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.content.Intent as Intent1

class Launch1 : AppCompatActivity() {
    private var gt1: LinearLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch1)
        gt1 = findViewById<LinearLayout>(R.id.Linear)
    }

    fun gt1(view: View) {
        intent = Intent1(this, launch2::class.java)
        startActivity(intent)
    }

}