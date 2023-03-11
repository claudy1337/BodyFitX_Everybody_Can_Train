package com.autonture.bodyfitx_everybody_can_train.ui.MainDashboards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.autonture.bodyfitx_everybody_can_train.R
import com.autonture.bodyfitx_everybody_can_train.databinding.ActivityMainDashboardBinding
import com.autonture.bodyfitx_everybody_can_train.ui.MainDashboards.Home.DashboardHomeFragment
import com.autonture.bodyfitx_everybody_can_train.ui.MainDashboards.Person.DashboardProfileFragment
import com.autonture.bodyfitx_everybody_can_train.ui.MainDashboards.Search.DashboardSearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main_dashboard.*

class MainDashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var bottomNav : BottomNavigationView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dashboard)
        loadFragment(DashboardHomeFragment())
        bottomNav = findViewById(R.id.bottomnavigationbar) as BottomNavigationView
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.mHome -> {
                    loadFragment(DashboardHomeFragment())
                    true
                }
                R.id.mPerson -> {
                    loadFragment(DashboardProfileFragment())
                    true
                }
                R.id.mSearch -> {
                    loadFragment(DashboardHomeFragment())
                    true
                }

                else -> {
                    loadFragment(DashboardHomeFragment())
                    true
                }
            }

        }
    }
    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentMain,fragment)
        transaction.commit()
    }

}