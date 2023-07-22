package com.example.listview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class ListViewActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view2)

        val name = intent.getStringExtra("Name")
        val mobileNo = intent.getStringExtra("MobileNo")
        val lastMsg = intent.getStringExtra("Message")
        val lastMsgTime = intent.getStringExtra("LastMessageTime")
        val imageId = intent.getIntExtra("ImageId",R.drawable.dhruv)

        val nametv = findViewById<TextView>(R.id.tvName)
        val mobileNotv = findViewById<TextView>(R.id.tvMobileNo)
        val lastMsgtv = findViewById<TextView>(R.id.tvlastMsg)
        val timetv = findViewById<TextView>(R.id.tvTime)
        val imageciv = findViewById<CircleImageView>(R.id.profile_image)

        nametv.text = name
        mobileNotv.text = mobileNo
        lastMsgtv.text = lastMsg
        timetv.text = lastMsgTime
        imageciv.setImageResource(imageId)
    }
}