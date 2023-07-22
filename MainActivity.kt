package com.example.listview2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var usersArrayList : ArrayList<Users>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("Dhruv","Adwait","Namya","Nishtha","Sahil","Shravani")

        val lastMsg = arrayOf("Hii,Good Morning","Hey,when are you free?","Let's go for a party!","That was Awesome","Completed assignment?","let's plan a trip!")

        val lastMsgTime = arrayOf("7:30 AM" ,"9:00 AM","8:15 PM","8:52 PM","9:17 PM","10:27 PM")

        val mobileNo = arrayOf("8928877448","9021547848","8877449568","7849612233","8947515764","8989754618")

        val imgId = intArrayOf(R.drawable.dhruv,R.drawable.adwait,R.drawable.namya,R.drawable.nishtha,R.drawable.sahil,R.drawable.shravani)

       usersArrayList = ArrayList()

        for(eachIndex in name.indices){
            val user = Users(name[eachIndex],lastMsg[eachIndex],lastMsgTime[eachIndex],mobileNo[eachIndex],imgId[eachIndex])

            usersArrayList.add(user)
        }

        val listView = findViewById<ListView>(R.id.ListView)
        listView.isClickable = true
        listView.adapter = MyAdapter(this,usersArrayList)

        listView.setOnItemClickListener { adapterView, view, i, l ->

            val userName = name[i]
            val userMobileNo = mobileNo[i]
            val userMsg = lastMsg[i]
            val id = imgId[i]
            val userMsgTime = lastMsgTime[i]

            val input = Intent(this,ListViewActivity2::class.java)
            input.putExtra("MobileNo",userMobileNo)
            input.putExtra("Name",userName)
            input.putExtra("Message",userMsg)
            input.putExtra("LastMessageTime",userMsgTime)
            input.putExtra("ImageId",id)
            startActivity(input)
        }

    }
}