package com.example.gamerapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.util.Patterns
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


const val PREF_FILE = "NASCAR_PREF"
const val EMAIL = "EMAIL"
const val PASSWORD = "PASSWORD"
const val IS_REMEMBERED = "IS_REMEMBERED"

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        val tfEmail:EditText=findViewById(R.id.EmailInput)
        val tfPassword:EditText=findViewById(R.id.PasswordInput)
        val mSharedPreferences :SharedPreferences =getSharedPreferences("loginPrefs",Context.MODE_PRIVATE)

        val isRemebred=mSharedPreferences.getBoolean(IS_REMEMBERED,false)
        if(isRemebred){
            intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        val goToRegister: TextView = findViewById(R.id.goToRegisterBtn)

        goToRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            //print(mSharedPreferences.getString(EMAIL,""))
            //mSharedPreferences.getString(PASSWORD,"")
        }

        val forgetPwd: TextView = findViewById(R.id.forgetPwd)
        forgetPwd.setOnClickListener {
            val intent = Intent(this, ForgetPasswordActivity::class.java)
            startActivity(intent)
        }

        val loginBtn: Button = findViewById(R.id.loginBtn)
        val rememberMeBtn: CheckBox = findViewById(R.id.rememberMeBtn)
        loginBtn.setOnClickListener {
            var editor = mSharedPreferences.edit()
            if (rememberMeBtn.isChecked) {

                editor.putString(EMAIL, tfEmail.text.toString())
                editor.putString(PASSWORD, tfEmail.text.toString())
                editor.putBoolean(IS_REMEMBERED,true)
                editor.apply()
            }else{
                editor.clear()
            }
            intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

       /* private fun showToast(message: String) {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }*/




    }


}