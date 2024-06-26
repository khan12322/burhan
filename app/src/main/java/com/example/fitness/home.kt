package com.example.fitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.google.android.material.bottomnavigation.BottomNavigationView

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val button = findViewById<LinearLayout>(R.id.step_1_2)
        button.setOnClickListener {
            val intent = Intent(this, before_second::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<LinearLayout>(R.id.step_2_1)
        button2.setOnClickListener {
            val intent = Intent(this, after_second::class.java)
            startActivity(intent)
        }

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    val intent = Intent(this, home::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_map -> {
                    // Handle map action
                    true
                }
                R.id.navigation_calendar -> {
                    val intent = Intent(this, CalendarActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}
