package com.example.gamerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OtpAvticity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_avticity)
        val verifyBtn:Button=findViewById(R.id.verifyBtn)
        verifyBtn.setOnClickListener {
            val intent = Intent(this, ResetPwdActivity::class.java)
            startActivity(intent)
        }
    }
}