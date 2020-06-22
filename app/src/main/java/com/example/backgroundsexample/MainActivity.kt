package com.example.backgroundsexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
  lateinit var disableFox:Button
  lateinit var foxBtn:Button
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    disableFox = findViewById(R.id.disableFox)
    foxBtn = findViewById(R.id.foxBtn)
    disableFox.setOnClickListener {
      val state = foxBtn.isEnabled
      foxBtn.isEnabled = !state
    }
    foxBtn.setOnClickListener {
      val state = disableFox.isEnabled
      disableFox.isEnabled = !state
    }
  }
}