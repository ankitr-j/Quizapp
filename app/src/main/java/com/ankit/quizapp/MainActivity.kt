package com.ankit.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1: Button =findViewById(R.id.btn1)
        val et1: EditText=findViewById(R.id.et1)
        btn1.setOnClickListener{
            if(et1.text.isEmpty()){
                Toast.makeText(this,"Please enter your Name",Toast.LENGTH_LONG).show()

            }
            else{
                val intent= Intent(this,Questions1::class.java)
                intent.putExtra(Constants.USER_NAME,et1.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}