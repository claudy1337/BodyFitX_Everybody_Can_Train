package com.autonture.bodyfitx_everybody_can_train.ui.MainDashboards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.autonture.bodyfitx_everybody_can_train.R

class MainDashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dashboard)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.coordinator, DashboardHomeFragment())
            .commit()

    }
}