package com.example.helloworld

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val s = findViewById<Button>(R.id.loginOrRegister)

        s.setOnClickListener{
            val intent = Intent(this@MainActivity,TimeTableFragment::class.java)
            startActivity(intent)
        }

    }
}