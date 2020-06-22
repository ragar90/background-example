package com.example.backgroundsexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
  lateinit var disableFox:Button
  lateinit var foxBtn:Button
  lateinit var roundBtn1:Button
  lateinit var roundBtn2:Button
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    disableFox = findViewById(R.id.disableFox)
    foxBtn = findViewById(R.id.foxBtn)
    roundBtn1 = findViewById(R.id.roundBtn1)
    roundBtn2 = findViewById(R.id.roundBtn2)
    disableFox.setOnClickListener { toggleEnable(foxBtn) }
    foxBtn.setOnClickListener { toggleEnable(disableFox) }
    roundBtn1.setOnClickListener {
      toggleEnable(roundBtn2)
      toggleEnable(it)
    }
    roundBtn2.setOnClickListener {
      toggleEnable(roundBtn1)
      toggleEnable(it)
    }
  }


  private fun toggleEnable(view: View) {
    val state = view.isEnabled
    view.isEnabled = !state
  }
}