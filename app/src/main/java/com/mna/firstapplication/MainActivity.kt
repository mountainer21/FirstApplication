package com.mna.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MY_LOG", "Log work")
        Log.i("MY_LOG", "error log")
        Log.i("MY_LOG", "verbose log")
    }
}