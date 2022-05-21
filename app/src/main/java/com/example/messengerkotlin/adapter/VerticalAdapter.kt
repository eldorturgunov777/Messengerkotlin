package com.example.messengerkotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.messengerkotlin.R
import com.example.messengerkotlin.model.Chat_vertical


/**
 * Created by Eldor Turgunov on 21.05.2022.
 * Messenger kotlin
 * eldorturgunov777@gmail.com
 */
class VerticalAdapter(var context: Context, var list: List<Chat_vertical>) :
    RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): VerticalAdapter.VerticalViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.vertical_item, parent, false)
        return VerticalViewHolder(view)
    }

    override fun onBindViewHolder(holder: VerticalAdapter.VerticalViewHolder, position: Int) {
        val data = list[position]
        holder.imageView.setImageResource(data.img)
        holder.title.setText(data.fullName)
        holder.desc.setText(data.desc)
        holder.online.isBaselineAligned = data.online

        if (data.online) {
            holder.online.visibility = View.VISIBLE
        } else {
            holder.online.visibility = View.GONE
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class VerticalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView
        var title: TextView
        var desc: TextView
        var online: LinearLayout


        init {
            imageView = itemView.findViewById(R.id.iv_vertical)
            title = itemView.findViewById(R.id.tv_fullname_ver)
            desc = itemView.findViewById(R.id.tv_desc_ver)
            online = itemView.findViewById(R.id.is_online)
        }
    }
}