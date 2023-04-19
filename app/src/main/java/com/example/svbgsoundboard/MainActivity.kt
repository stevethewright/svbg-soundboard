package com.example.svbgsoundboard

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_view)
        findViewById<Button>(R.id.settings_button)
            .setOnClickListener {
                setContentView(R.layout.settings_view)
            }
    }
}
