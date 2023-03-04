package com.autonture.bodyfitx_everybody_can_train.ui.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.autonture.bodyfitx_everybody_can_train.R
import com.autonture.bodyfitx_everybody_can_train.Ultis.CellClickListener

class SessionAdapter(val posts:ArrayList<String>, private val cellClickListener: CellClickListener) : RecyclerView.Adapter<SessionAdapter.SessionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SessionViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.session_item, parent, false)
        return SessionViewHolder(view)
    }


    override fun onBindViewHolder(holder: SessionViewHolder, position: Int) {
        holder.session_image_items.setImageResource(R.drawable.card_goals)
        holder.session_name_items.setText(R.string.name_session_text)
        holder.session_title_items.setText(R.string.title_session_text)

        holder.itemView.setOnClickListener {
            cellClickListener.onCellClickListener()
        }
    }

    override fun getItemCount() = posts.size

    class SessionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val session_image_items: ImageView = itemView.findViewById(R.id.icon_session_card)
        val session_name_items: TextView = itemView.findViewById(R.id.name_session_card)
        val session_title_items: TextView = itemView.findViewById(R.id.title_session_card)

    }
}