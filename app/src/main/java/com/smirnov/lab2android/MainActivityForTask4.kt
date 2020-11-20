package com.smirnov.lab2android

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivityForTask4 : AppCompatActivity() {
    private var secondsElapsed: Int = 0
    private var flag = false

    @SuppressLint("SetTextI18n")
    var backgroundThread = Thread {
        while (true) {
            Thread.sleep(1000)
            if (flag) {
                textSecondsElapsed.post {
                    textSecondsElapsed.text = "Seconds elapsed: " + secondsElapsed++
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        backgroundThread.start()

    }

    override fun onResume() {
        super.onResume()
        flag = true
    }

    override fun onPause() {
        super.onPause()
        flag = false
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("count", secondsElapsed)
    }

    @SuppressLint("SetTextI18n")
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        secondsElapsed = savedInstanceState.getInt("count")
        textSecondsElapsed.text = "Seconds elapsed: " + secondsElapsed++
    }
}