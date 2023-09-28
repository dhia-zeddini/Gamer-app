package com.example.gamerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForgetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)

        val sendBtn:Button=findViewById(R.id.sendEmailBtn)

        sendBtn.setOnClickListener {
            val intent = Intent(this, OtpAvticity::class.java)
            startActivity(intent)
        }
    }
}