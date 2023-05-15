package com.ankit.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tv_Name: TextView=findViewById(R.id.tv_name)
        val tv_Score: TextView=findViewById(R.id.tv_score)
        val btnFinish: Button=findViewById(R.id.tv_finish)
        val tv_congrats: TextView=findViewById(R.id.tv_congratulations)

        tv_Name.text=intent.getStringExtra(Constants.USER_NAME)
        val totalQuestion=intent.getIntExtra(Constants.TOTAL_QUESTION,0)
        val correctAnswers=intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        if(correctAnswers>5){
            tv_congrats.text="Hey, congratulations!"

        }
        else{
            tv_congrats.text="Better luck next time :)"
        }
        tv_Score.text="You scored $correctAnswers out of $totalQuestion"
        btnFinish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}