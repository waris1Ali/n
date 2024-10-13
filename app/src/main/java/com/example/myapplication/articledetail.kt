package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ArticleDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.articledetail)

        val title = intent.getStringExtra("title")
        val image = intent.getIntExtra("image", 0)
        val author = intent.getStringExtra("author")
        val details = intent.getStringExtra("details")

        findViewById<TextView>(R.id.tittle6).text = title
        findViewById<ImageView>(R.id.image6).setImageResource(image)
        findViewById<TextView>(R.id.author4).text = author
        findViewById<TextView>(R.id.detail4).text = details


    }
}