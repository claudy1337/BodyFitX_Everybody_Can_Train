package com.autonture.bodyfitx_everybody_can_train.ui.RightsVerif

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.autonture.bodyfitx_everybody_can_train.R
import com.autonture.bodyfitx_everybody_can_train.ui.MainDashboards.MainDashboard
import com.autonture.bodyfitx_everybody_can_train.ui.Workouts.WorkoutCertain
import kotlinx.android.synthetic.main.activity_clock_data.*

class ClockData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clock_data)
        begin_clock_button.setOnClickListener {
            val intent = Intent(this, MainDashboard::class.java) //WorkoutCertain
            startActivity(intent)
        }
    }
}