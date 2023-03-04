package com.autonture.bodyfitx_everybody_can_train.ui.Workouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.autonture.bodyfitx_everybody_can_train.Ultis.CellClickListener
import com.autonture.bodyfitx_everybody_can_train.ui.Adapters.NeedItemAdapter
import com.autonture.bodyfitx_everybody_can_train.R
import com.autonture.bodyfitx_everybody_can_train.TaskActivity
import com.autonture.bodyfitx_everybody_can_train.ui.Adapters.TaskItemAdapter
import com.autonture.bodyfitx_everybody_can_train.ui.MainDashboards.MainDashboard
import kotlinx.android.synthetic.main.activity_workout_certain.*

class WorkoutCertain : AppCompatActivity(), CellClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_certain)
        val posts: ArrayList<String> = ArrayList()
        for (i in 1..30){
            posts.add("Need #$i")
        }
        need_recycler_view.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL,false)
        need_recycler_view.adapter = NeedItemAdapter(posts)

        task_recycler_view.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        task_recycler_view.adapter = TaskItemAdapter(posts, this)

        buttonStart.setOnClickListener {
            val intent = Intent(this, MainDashboard::class.java) //WorkoutCertain
            startActivity(intent)
        }
    }

    override fun onCellClickListener() {
        val intent = Intent(this, TaskActivity::class.java)
        startActivity(intent)
    }
}