package com.example.fitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class after2 : AppCompatActivity() {
    private lateinit var timerButton: Button
    private lateinit var startButton: Button
    private lateinit var timer: CountDownTimer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after2)
        timerButton = findViewById(R.id.timer_button)
        startButton = findViewById(R.id.start_button)

        startButton.setOnClickListener {
            startTimer(60000)
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
    private fun startTimer(duration: Long) {
        startButton.isEnabled = false // Disable the start button
        timer = object : CountDownTimer(duration, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val secondsRemaining = millisUntilFinished / 1000
                timerButton.text = String.format("%02d:%02d", secondsRemaining / 60, secondsRemaining % 60)
            }

            override fun onFinish() {
                timerButton.text = getString(R.string.time1) // Reset to initial time or set to "Done"
                startButton.isEnabled = true // Re-enable the start button
            }
        }
        timer.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        if (::timer.isInitialized) {
            timer.cancel()
        }
    }

}