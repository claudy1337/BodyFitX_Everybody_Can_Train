package com.autonture.bodyfitx_everybody_can_train.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.autonture.bodyfitx_everybody_can_train.R
import kotlinx.android.synthetic.main.activity_onboarding.*

class OnboardingActivity : AppCompatActivity() {
    private var progression = 10
    var index = 0
    private val images = arrayOf(
        R.drawable.track_onboarding,
        R.drawable.training_onboarding,
        R.drawable.nutrition_onboarding,
        R.drawable.sleep_onboarding
    )
    private val low_text = arrayOf(
        R.string.track_title,
        R.string.training_title,
        R.string.nutrition_title,
        R.string.sleep_title
    )
    private val header_text = arrayOf(
        R.string.track_text,
        R.string.training_text,
        R.string.nutrition_text,
        R.string.sleep_text
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
        setClickAgreements(0)
        fab.setOnClickListener {
            progression += 30
            setClickAgreements(index)
        }

    }
    private fun updateProgressBar() {
        progressBarItem.progress = progression
    }
    private fun setClickAgreements(actCount: Int){
        if(actCount <= images.size && progression <= 100){
            updateProgressBar()
            onboarding_Image.setImageResource(images[index])
            Onboarding_Header_Text.setText(header_text[index])
            Onboarding_Low_Text.setText(low_text[index])
            index = (index + 1) % images.size
        }
        else{
            val intent = Intent(this, Authenticate::class.java)
            startActivity(intent)
        }
    }


}