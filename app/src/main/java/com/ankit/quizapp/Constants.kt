package com.ankit.quizapp

import java.util.*

object Constants {
    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTION:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionlist=ArrayList<Question>()
        val que1=Question(1,"Which country does this flag belongs to?",
        R.drawable.argentina,"Cambodia","Argentina","Armenia","Italy",
        2)
        questionlist.add(que1)
        val que2=Question(2,"Which country does this player play for?",
            R.drawable.benstokes,"England","UK","Ireland","Scotland",
            1)
        questionlist.add(que2)
        val que3=Question(3,"Which company has the following logo",
            R.drawable.audi,"Mercedes","BMW","Audi","Rolls Royce",
            3)
        questionlist.add(que3)
        val que4=Question(4,"Guess the country from the following outline",
            R.drawable.azerbaijan,"Sri Lanka","Argentina","Armenia","Azerbaijan",
            4)
        questionlist.add(que4)
        val que5=Question(5,"He is head of which of the following country?",
            R.drawable.germany,"Australia","Argentina","Germany","Italy",
            2)
        questionlist.add(que5)
        val que6=Question(6,"Choose the correct name of singer",
            R.drawable.dualipa,"Ariana Grande","Lana Del Rey","Dua Lipa","Billie Eilish",
            3)
        questionlist.add(que6)
        val que7=Question(7,"Who is CEO of the given company?",
            R.drawable.openai,"Bracken P. Darrell","Neal Mohan","Elon Musk","Sam Altman",
            4)
        questionlist.add(que7)
        val que8=Question(8,"Choose the name of this iconic place?",
            R.drawable.shibuya,"New York","Shibuya","Munich","Canberra",
            2)
        questionlist.add(que8)
        val que9=Question(9,"who is the leader of the given country?",
            R.drawable.russia,"Vladimir Putin","Anthony Albanese","Leo Varadkar","Tayyip Erdogan",
            1)
        questionlist.add(que9)
        val que10=Question(10,"In what context this is used?",
            R.drawable.lgbtq,"LGBTQ","Peace","BLM","Democracy",
            1)
        questionlist.add(que10)



        return questionlist


    }
}