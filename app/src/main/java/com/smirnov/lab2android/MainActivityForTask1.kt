package com.smirnov.lab2android

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivityForTask1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("myLogs", "onCreate()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("myLogs", "onDestroy()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("myLogs", "onPause()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("myLogs", "onRestart()")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("myLogs", "onRestoreInstanceState()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("myLogs", "onResume()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("myLogs", "onSaveInstanceState()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("myLogs", "onStart()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("myLogs", "onStop()")
    }
}