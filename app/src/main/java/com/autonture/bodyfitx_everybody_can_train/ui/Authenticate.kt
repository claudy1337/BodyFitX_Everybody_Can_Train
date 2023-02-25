package com.autonture.bodyfitx_everybody_can_train.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.autonture.bodyfitx_everybody_can_train.R
import com.autonture.bodyfitx_everybody_can_train.fragments.DataEntryFragment
import com.autonture.bodyfitx_everybody_can_train.fragments.SignInEntryFragment
import kotlinx.android.synthetic.main.activity_authenticate.*
import kotlinx.android.synthetic.main.activity_onboarding.*
import kotlin.concurrent.thread

class Authenticate : AppCompatActivity() {

    private var index = 0
    private val account_status_fragment = arrayOf(
        DataEntryFragment.newInstance(),
        SignInEntryFragment.newInstance()
    )
    private val account_status_text = arrayOf(
        R.string.AlreadyAcc,
        R.string.DntReadyAcc
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