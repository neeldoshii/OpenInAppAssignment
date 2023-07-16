package com.example.openinapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.openinapp.R

class ViewPagerAdapter(var title: MutableList<String>, var description: MutableList<String>) :
    RecyclerView.Adapter<ViewPagerAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerAdapter.MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.item_page,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.MyViewHolder, position: Int) {
        holder.title.text = title[position]
        holder.description.text = description[position]
    }

    override fun getItemCount(): Int {
        return title.size
    }

    class MyViewHolder(itemView: View) : ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.title)
        val description: TextView = itemView.findViewById(R.id.description)
        val avatarImageView: ImageView = itemView.findViewById(R.id.avatarImageView)
    }

}
