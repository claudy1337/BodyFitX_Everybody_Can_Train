package com.autonture.bodyfitx_everybody_can_train.ui.MainDashboards

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.autonture.bodyfitx_everybody_can_train.R
import com.autonture.bodyfitx_everybody_can_train.ui.Onboarding.OnboardingActivity
import com.autonture.bodyfitx_everybody_can_train.ui.Onboarding.TrainingSessionsActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnGetStarted.setOnClickListener {
            val intent = Intent(this, OnboardingActivity::class.java)
            startActivity(intent)
        }
    }
}