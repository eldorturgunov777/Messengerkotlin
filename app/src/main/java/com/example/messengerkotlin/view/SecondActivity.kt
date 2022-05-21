package com.example.messengerkotlin.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.messengerkotlin.R
import com.example.messengerkotlin.adapter.SecondAdapter
import com.example.messengerkotlin.model.Chat_vertical
import com.example.messengerkotlin.model.SecondModel

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewSecond)
        recyclerView.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        val list = ArrayList<SecondModel>()
        recyclerView.setHasFixedSize(true)
        val secondAdapter = SecondAdapter(applicationContext, list)
        recyclerView.adapter = secondAdapter
        list.add(SecondModel(R.drawable.img5, R.drawable.img5, "Eldor Turgunov", 0))
        list.add(SecondModel(R.drawable.img3, R.drawable.img3, "Eldor Turgunov", 3))
        list.add(SecondModel(R.drawable.img4, R.drawable.img4, "Eldor Turgunov", 0))
        list.add(SecondModel(R.drawable.img5, R.drawable.img5, "Eldor Turgunov", 1))
        list.add(SecondModel(R.drawable.img6, R.drawable.img6, "Eldor Turgunov", 1))
        list.add(SecondModel(R.drawable.img7, R.drawable.img7, "Eldor Turgunov", 3))
        list.add(SecondModel(R.drawable.img8, R.drawable.img8, "Eldor Turgunov", 0))
        list.add(SecondModel(R.drawable.img2, R.drawable.img2, "Eldor Turgunov", 1))
        list.add(SecondModel(R.drawable.img2, R.drawable.img2, "Eldor Turgunov", 0))
        list.add(SecondModel(R.drawable.img3, R.drawable.img3, "Eldor Turgunov", 3))
        list.add(SecondModel(R.drawable.img4, R.drawable.img4, "Eldor Turgunov", 0))
        list.add(SecondModel(R.drawable.img5, R.drawable.img5, "Eldor Turgunov", 1))
        list.add(SecondModel(R.drawable.img6, R.drawable.img6, "Eldor Turgunov", 1))
        list.add(SecondModel(R.drawable.img7, R.drawable.img7, "Eldor Turgunov", 3))
        list.add(SecondModel(R.drawable.img8, R.drawable.img8, "Eldor Turgunov", 0))
        list.add(SecondModel(R.drawable.img2, R.drawable.img2, "Eldor Turgunov", 1))
    }
}