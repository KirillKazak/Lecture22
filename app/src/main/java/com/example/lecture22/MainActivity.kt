package com.example.lecture22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val EMAIL = "email"
        val PASSWORD = "password"

        val email = findViewById<EditText>(R.id.edit_text_email)
        val password = findViewById<EditText>(R.id.edit_text_password)
        val button = findViewById<Button>(R.id.button).setOnClickListener(View.OnClickListener {
            val intent = Intent(baseContext, MainActivity2::class.java)
            intent.putExtra(EMAIL, email.text.toString())
            intent.putExtra(PASSWORD, password.text.toString())
            startActivity(intent)
        })
    }
}