package com.example.study_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent1.*
import kotlinx.android.synthetic.main.activity_main.*


class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var acb = 10
        var b= acb *10
        var c= acb *100

        change_activity.setOnClickListener {
            val intent=Intent(this@Intent1,Intent2::class.java)
            startActivity(intent)
        }
    }
}