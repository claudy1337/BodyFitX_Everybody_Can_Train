package com.autonture.bodyfitx_everybody_can_train.ui.RightsVerif

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.autonture.bodyfitx_everybody_can_train.R
import kotlinx.android.synthetic.main.activity_authenticate.*
import kotlin.concurrent.thread

class Authenticate : AppCompatActivity() {

    private var index = 0
    private val account_status_fragment = arrayOf(
        SignInEntryFragment.newInstance(),
        DataEntryFragment.newInstance()
    )
    private val account_status_text = arrayOf(
        R.string.DntReadyAcc,
        R.string.AlreadyAcc
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authenticate)
        setStatusAccount(index)
        thread {
            Create_Logining_Text.setOnClickListener {
                setStatusAccount(index)
            }
        }
        google_button.setOnClickListener {
            val intent = Intent(this, ClockData::class.java)
            startActivity(intent)
        }

    }
    private fun setStatusAccount(actCount: Int) {
            if(actCount <= account_status_fragment.count()){
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.constrainting, account_status_fragment[index])
                    .commit()
                Create_Logining_Text.setText(account_status_text[index])
                index = (index + 1) % account_status_fragment.size
            }
    }
}