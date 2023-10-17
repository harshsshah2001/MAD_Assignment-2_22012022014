    package com.example.mad_assignment_2_22012022014

import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

    class MainActivity : AppCompatActivity() {

        companion object{
            val path=Path()
            val PaintBrush=Paint()
        }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val redbtn=findViewById<ImageButton>(R.id.redcolor)
        val bluebtn=findViewById<ImageButton>(R.id.bluecolor)
        val blackbtn=findViewById<ImageButton>(R.id.blackcolor)
        val eraser=findViewById<ImageButton>(R.id.whitecolor)

        redbtn.setOnClickListener {
            Toast.makeText(this,"Red Button is Clicked",Toast.LENGTH_SHORT).show()
        }
        bluebtn.setOnClickListener {
            Toast.makeText(this,"Blue Button is Clicked",Toast.LENGTH_SHORT).show()
        }
        blackbtn.setOnClickListener {
            Toast.makeText(this,"black Button is Clicked",Toast.LENGTH_SHORT).show()
        }
        eraser.setOnClickListener {
            Toast.makeText(this,"eraser Button is Clicked",Toast.LENGTH_SHORT).show()
        }
    }
}