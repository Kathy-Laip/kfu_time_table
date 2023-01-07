package com.example.helloworld

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import io.getstream.avatarview.AvatarView
import io.getstream.avatarview.coil.loadImage

class TimeTableFragment : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_time_table)

        val avatarView: AvatarView = findViewById(R.id.avatarView)
        val drawableRes = R.drawable.acc

        avatarView.loadImage(drawableRes)

        }
    }
