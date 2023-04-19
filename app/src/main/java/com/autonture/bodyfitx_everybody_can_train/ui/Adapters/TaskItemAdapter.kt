package com.autonture.bodyfitx_everybody_can_train.ui.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.autonture.bodyfitx_everybody_can_train.Ultis.CellClickListener
import com.autonture.bodyfitx_everybody_can_train.R

class TaskItemAdapter(val posts:ArrayList<String>, private val cellClickListener: CellClickListener) : RecyclerView.Adapter<TaskItemAdapter.TaskViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.task_list_item, parent, false)
        return TaskViewHolder(view)
    }


    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.task_image_items.setImageResource(R.drawable.task_items)
        holder.task_header_text_items.text = "Тренировка Гантелями"
        holder.task_time_text_items.text = "05:00"
        holder.itemView.setOnClickListener {
            cellClickListener.onCellClickListener()
        }
    }

    override fun getItemCount() = posts.size

    class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val task_image_items: ImageView = itemView.findViewById(R.id.task_image_item)
        val task_header_text_items: TextView = itemView.findViewById(R.id.task_header_text_item)
        val task_time_text_items: TextView = itemView.findViewById(R.id.task_time_text_item)

    }
}
