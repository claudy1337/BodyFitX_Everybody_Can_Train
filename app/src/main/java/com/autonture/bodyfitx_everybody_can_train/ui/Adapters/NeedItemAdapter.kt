package com.autonture.bodyfitx_everybody_can_train.ui.Adapters

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import  android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.autonture.bodyfitx_everybody_can_train.R

class NeedItemAdapter(val posts:ArrayList<String>) : RecyclerView.Adapter<NeedItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.need_item, parent, false)
        return  ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.need_items.setImageResource(R.drawable.barbel_item)
        holder.need_texts.text = "Гантели"
    }

    override fun getItemCount() = posts.size


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val need_items: ImageView = itemView.findViewById(R.id.image_Need)
        val need_texts: TextView = itemView.findViewById(R.id.text_Need)
    }

}