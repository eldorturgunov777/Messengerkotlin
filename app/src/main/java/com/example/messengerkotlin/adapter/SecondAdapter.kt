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
import com.example.messengerkotlin.model.SecondModel


/**
 * Created by Eldor Turgunov on 21.05.2022.
 * Messenger kotlin
 * eldorturgunov777@gmail.com
 */
class SecondAdapter(var context: Context, var list: List<SecondModel>) :
    RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SecondAdapter.SecondViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.second_item, parent, false)
        return SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondAdapter.SecondViewHolder, position: Int) {
        val data = list[position]

        holder.img1?.setImageResource(data.img)
        holder.img2?.setImageResource(data.imgVertical)
        holder.title?.text = data.title
        holder.desc?.text = Integer.toString(data.desc)

        if (position == 0) {
            holder.img2?.scaleType = ImageView.ScaleType.CENTER
            holder.img2!!.setImageResource(R.drawable.ic_add)
            holder.img2!!.setBackgroundColor(Color.parseColor("#ffffff"))
            holder.title!!.text = "Add to Story"
            holder.layout!!.visibility = View.GONE
        }
        if (data.desc > 0) {
            holder.layout!!.visibility = View.VISIBLE
        } else {
            holder.layout!!.visibility = View.GONE
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class SecondViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var img1: ImageView? = null
        var img2: ImageView? = null
        var title: TextView? = null
        var desc: TextView? = null
        var layout: LinearLayout? = null

        init {
            img1 = itemView.findViewById(R.id.img)
            img2 = itemView.findViewById(R.id.iv_vertical)
            title = itemView.findViewById(R.id.title)
            desc = itemView.findViewById(R.id.desc)
            layout = itemView.findViewById(R.id.layout)
        }
    }

}