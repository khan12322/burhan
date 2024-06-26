package com.example.fitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.google.android.material.bottomnavigation.BottomNavigationView

class after_second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_second)
        val button = findViewById<LinearLayout>(R.id.before_1)
        button.setOnClickListener {
            val intent = Intent(this, after1::class.java)
            startActivity(intent)
        }
        val btn2 = findViewById<LinearLayout>(R.id.before_2)
        btn2.setOnClickListener {
            val intent = Intent(this, after2::class.java)
            startActivity(intent)
        }
        val btn3 = findViewById<LinearLayout>(R.id.before_3)
        btn3.setOnClickListener {
            val intent = Intent(this, after3::class.java)
            startActivity(intent)
        }
        val btn4 = findViewById<LinearLayout>(R.id.before_4)
        btn4.setOnClickListener {
            val intent = Intent(this, after4::class.java)
            startActivity(intent)
        }
        val btn5 = findViewById<LinearLayout>(R.id.before_5)
        btn5.setOnClickListener {
            val intent = Intent(this, after5::class.java)
            startActivity(intent)
        }
        val btn6 = findViewById<LinearLayout>(R.id.before_6)
        btn6.setOnClickListener {
            val intent = Intent(this, after6::class.java)
            startActivity(intent)
        }
        val btn7 = findViewById<LinearLayout>(R.id.before_7)
        btn7.setOnClickListener {
            val intent = Intent(this, after7::class.java)
            startActivity(intent)
        }
        val btn8 = findViewById<LinearLayout>(R.id.before_8)
        btn8.setOnClickListener {
            val intent = Intent(this, after8::class.java)
            startActivity(intent)
        }
        val btn9 = findViewById<LinearLayout>(R.id.before_9)
        btn9.setOnClickListener {
            val intent = Intent(this, after9::class.java)
            startActivity(intent)
        }
        val btn10 = findViewById<LinearLayout>(R.id.before_10)
        btn10.setOnClickListener {
            val intent = Intent(this, after10::class.java)
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