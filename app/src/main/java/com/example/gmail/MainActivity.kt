package com.example.gmail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Tạo danh sách email mẫu
    val emails = listOf(
        Email("Hust", "Hello world", "This is a snippet of email content...", "20:05 PM", true),
        Email("Mathieu C", "Hi Luan Dinh", "This is another email snippet...", "12:20 AM", false),
        Email("Google.com", "You are Dinh Van Luan?", "Here is more email content...", "03:04 AM", true),
        Email("Nasa", "Hi Luan Dinh", "Support email snippet here...", "10:45 AM", false),
        Email("Youtube", "Hi Luan Dinh", "Snippet of last email...", "18:15 AM", true)
    )

        val adapter = EmailAdapter(emails)
        recyclerView.adapter = adapter
    }
}
