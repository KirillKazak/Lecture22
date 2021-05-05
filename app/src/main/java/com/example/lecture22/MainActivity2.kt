package com.example.lecture22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var textView = findViewById<TextView>(R.id.text_view).setText("${intent.getStringExtra(MainActivity.EMAIL.toString())} - ${intent.getStringExtra(MainActivity.PASSWORD.toString())}")
    }
}

