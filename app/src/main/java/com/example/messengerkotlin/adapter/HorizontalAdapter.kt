package com.example.messengerkotlin.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.messengerkotlin.R
import com.example.messengerkotlin.model.Chat_horizontal


/**
 * Created by Eldor Turgunov on 21.05.2022.
 * Messenger kotlin
 * eldorturgunov777@gmail.com
 */
class HorizontalAdapter(var context: Context, var list: List<Chat_horizontal>) :
    RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HorizontalAdapter.HorizontalViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.horizontal_item, parent, false)
        return HorizontalViewHolder(view)
    }

    override fun onBindViewHolder(holder: HorizontalAdapter.HorizontalViewHolder, position: Int) {
        val data = list[position]
        holder.imageView.setImageResource(data.img)
        holder.fullName.setText(data.fullName)
        if (position == 0) {
            holder.imageView.scaleType = ImageView.ScaleType.CENTER
            holder.imageView.setBackgroundColor(Color.parseColor("#303030"))
            holder.online.visibility = View.GONE
        } else {
            holder.online.visibility = View.VISIBLE
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class HorizontalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView
        var fullName: TextView
        var online: LinearLayout

        init {
            imageView = itemView.findViewById(R.id.iv_horizontal)
            fullName = itemView.findViewById(R.id.tv_horizontal)
            online = itemView.findViewById(R.id.is_online)
        }
    }


}