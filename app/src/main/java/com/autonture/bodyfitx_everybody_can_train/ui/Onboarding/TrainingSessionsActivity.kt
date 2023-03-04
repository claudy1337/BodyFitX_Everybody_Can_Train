package com.autonture.bodyfitx_everybody_can_train.ui.Onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.autonture.bodyfitx_everybody_can_train.R
import com.autonture.bodyfitx_everybody_can_train.Ultis.CellClickListener
import com.autonture.bodyfitx_everybody_can_train.ui.Adapters.SessionAdapter
import com.autonture.bodyfitx_everybody_can_train.ui.RightsVerif.ClockData
import com.autonture.bodyfitx_everybody_can_train.ui.Workouts.WorkoutCertain
import kotlinx.android.synthetic.main.activity_training_sessions.*

class TrainingSessionsActivity : AppCompatActivity(), CellClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_training_sessions)
        val posts: ArrayList<String> = ArrayList()
        for (i in 1..3){
            posts.add("sad")
        }


        select_sessions_list.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        select_sessions_list.adapter = SessionAdapter(posts, this)

    }

    override fun onCellClickListener() {
        val intent = Intent(this, ClockData::class.java) //WorkoutCertain
        startActivity(intent)
    }
}