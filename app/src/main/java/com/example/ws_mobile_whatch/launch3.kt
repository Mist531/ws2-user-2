package com.example.ws_mobile_whatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.core.content.ContextCompat.startActivity

class launch3 : AppCompatActivity() {
    private var name: EditText? = null
    private var lastname: EditText? = null
    private var email2: EditText? = null
    private var password2: EditText? = null
    private var passwordpovt: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch3)
        name = findViewById(R.id.name)
        lastname = findViewById(R.id.lastname)
        email2 = findViewById(R.id.email2)
        password2 = findViewById(R.id.password2)
        passwordpovt = findViewById(R.id.passwordpovt)
    }

    fun register1(view: View) {
        if ((name?.text?.length != 0) and (lastname?.text?.length != 0) and (email2?.text?.length != 0) and (password2?.text?.length != 0) and (passwordpovt?.text?.length != 0)){
            if (email2?.text.toString().isEmailValid()){
                if (passwordpovt?.text?.length == password2?.text?.length){
                    intent = Intent(this, launch4::class.java)
                    startActivity(intent)}
                else{
                    passwordpovt?.error = "Введите одинаковые пароли"
                }
                }
            else{
                email2?.error = "Введите коректный Email"
                if (passwordpovt?.text?.length == password2?.text?.length){
                    intent = Intent(this, launch4::class.java)
                    startActivity(intent)}
                else{
                    passwordpovt?.error = "Введите одинаковые пароли"
                }
            }
            }
        else{
            if (name?.text?.length == 0){name?.error = "Введите двнные"}
            if (lastname?.text?.length == 0){lastname?.error = "Введите двнные"}
            if (email2?.text?.length == 0){email2?.error = "Введите двнные"}
            if (passwordpovt?.text?.length == 0){passwordpovt?.error = "Введите двнные"}
            if (password2?.text?.length == 0){password2?.error = "Введите двнные"}
        }
        }
    fun estacc(view: View) {
        intent = Intent(this, launch2::class.java)
        startActivity(intent)
    }
    public fun String.isEmailValid(): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
    }

}