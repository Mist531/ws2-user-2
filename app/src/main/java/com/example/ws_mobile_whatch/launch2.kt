package com.example.ws_mobile_whatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.lang.Error

class launch2 : AppCompatActivity() {
    private var Email: EditText? = null
    private var Password: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch2)
        Email = findViewById(R.id.Email1)
        Password = findViewById(R.id.Password1)
    }

    fun Vhod(view: View) {
        if ((Email?.text?.length != 0) and (Password?.text?.length != 0)){
            if (Email?.text.toString().isEmailValid()){
                intent = Intent(this, launch4::class.java)
                startActivity(intent)
            }
            else{
                Email?.error = "Введите коректный Email"
            }
        }
        else {
            if (Email?.text?.length == 0){Email?.error = "Введите двнные"}
            if (Password?.text?.length == 0){Password?.error = "Введите двнные"}
        }
    }
    fun register(view: View) {
        intent = Intent(this, launch3::class.java)
        startActivity(intent)
    }
    public fun String.isEmailValid(): Boolean{
        return android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()

    }
}