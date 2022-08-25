package com.gulhan.firstweeksample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

// this is working
    private lateinit var button: Button
    private lateinit var myText: TextView
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     button = findViewById(R.id.button)
     myText = findViewById(R.id.textView2)
     button.setOnClickListener{
        // Toast.makeText(this, "Button clicked." , Toast.LENGTH_SHORT).show()
      myText.text = "Text changed !"
      imageView = findViewById(R.id.imageView2)

     }

    }
}