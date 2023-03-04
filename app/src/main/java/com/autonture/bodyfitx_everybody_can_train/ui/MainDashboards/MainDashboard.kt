package com.autonture.bodyfitx_everybody_can_train.ui.MainDashboards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.autonture.bodyfitx_everybody_can_train.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main_dashboard.*

class MainDashboard : AppCompatActivity() {
    val text = "Пора покормить кота!"
    val duration = Toast.LENGTH_SHORT
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dashboard)
        bottomnavigationbar.selectedItemId = R.id.mHome
        bottomnavigationbar.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.mPerson -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.coordinator, DashboardProfileFragment())
                        .commit()
                }
                R.id.mHome -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.coordinator, DashboardHomeFragment())
                        .commit()
                }
            }
            true
        }


    }
}