package com.example.messengerkotlin.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.messengerkotlin.R
import com.example.messengerkotlin.adapter.HorizontalAdapter
import com.example.messengerkotlin.adapter.VerticalAdapter
import com.example.messengerkotlin.model.Chat_horizontal
import com.example.messengerkotlin.model.Chat_vertical

class FirstActivity : AppCompatActivity() {
    lateinit var horizontalRecView: RecyclerView
    var chat_horizontals = ArrayList<Chat_horizontal>()
    lateinit var verticalRecView: RecyclerView
    var chat_verticals = ArrayList<Chat_vertical>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        horizontalRecView = findViewById(R.id.horizontalRecView)
        horizontalRecView.setHasFixedSize(true)
        horizontalRecView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val horizontalAdapter = HorizontalAdapter(this, chat_horizontals)
        horizontalRecView.adapter = horizontalAdapter
        horizontalData()

        verticalRecView = findViewById(R.id.verticalRecView)
        verticalRecView.setHasFixedSize(true)
        verticalRecView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val verticalAdapter = VerticalAdapter(this, chat_verticals)
        verticalRecView.adapter = verticalAdapter
        verticalData()
    }

    private fun horizontalData() {
        chat_horizontals.add(Chat_horizontal(R.drawable.ic_video_call, "Create room"))
        chat_horizontals.add(Chat_horizontal(R.drawable.img3, "Eldor Turgunov"))
        chat_horizontals.add(Chat_horizontal(R.drawable.img4, "Eldor Turgunov"))
        chat_horizontals.add(Chat_horizontal(R.drawable.img5, "Eldor Turgunov"))
        chat_horizontals.add(Chat_horizontal(R.drawable.img6, "Eldor Turgunov"))
        chat_horizontals.add(Chat_horizontal(R.drawable.img7, "Eldor Turgunov"))
        chat_horizontals.add(Chat_horizontal(R.drawable.img8, "Eldor Turgunov"))
        chat_horizontals.add(Chat_horizontal(R.drawable.img2, "Eldor Turgunov"))
        chat_horizontals.add(Chat_horizontal(R.drawable.img3, "Eldor Turgunov"))
        chat_horizontals.add(Chat_horizontal(R.drawable.img4, "Eldor Turgunov"))
        chat_horizontals.add(Chat_horizontal(R.drawable.img5, "Eldor Turgunov"))
    }

    private fun verticalData() {
        chat_verticals.add(Chat_vertical(R.drawable.img2, "Eldor Turgunov", "Last seen", false))
        chat_verticals.add(Chat_vertical(R.drawable.img3, "Eldor Turgunov", "Last seen", true))
        chat_verticals.add(Chat_vertical(R.drawable.img4, "Eldor Turgunov", "Last seen", false))
        chat_verticals.add(Chat_vertical(R.drawable.img5, "Eldor Turgunov", "Last seen", true))
        chat_verticals.add(Chat_vertical(R.drawable.img6, "Eldor Turgunov", "Last seen", false))
        chat_verticals.add(Chat_vertical(R.drawable.img7, "Eldor Turgunov", "Last seen", false))
        chat_verticals.add(Chat_vertical(R.drawable.img8, "Eldor Turgunov", "Last seen", true))
        chat_verticals.add(Chat_vertical(R.drawable.img2, "Eldor Turgunov", "Last seen", false))
        chat_verticals.add(Chat_vertical(R.drawable.img3, "Eldor Turgunov", "Last seen", true))
        chat_verticals.add(Chat_vertical(R.drawable.img4, "Eldor Turgunov", "Last seen", false))
        chat_verticals.add(Chat_vertical(R.drawable.img5, "Eldor Turgunov", "Last seen", false))
        chat_verticals.add(Chat_vertical(R.drawable.img6, "Eldor Turgunov", "Last seen", true))
        chat_verticals.add(Chat_vertical(R.drawable.img7, "Eldor Turgunov", "Last seen", false))
        chat_verticals.add(Chat_vertical(R.drawable.img8, "Eldor Turgunov", "Last seen", false))
        chat_verticals.add(Chat_vertical(R.drawable.img2, "Eldor Turgunov", "Last seen", true))
        chat_verticals.add(Chat_vertical(R.drawable.img3, "Eldor Turgunov", "Last seen", true))
    }
}