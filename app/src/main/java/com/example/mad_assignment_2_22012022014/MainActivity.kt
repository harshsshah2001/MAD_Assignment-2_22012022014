    package com.example.mad_assignment_2_22012022014

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.mad_assignment_2_22012022014.PaintView.Companion.colorList
import com.example.mad_assignment_2_22012022014.PaintView.Companion.currnetBrush
import com.example.mad_assignment_2_22012022014.PaintView.Companion.pathList

    class MainActivity : AppCompatActivity() {


      // We make companion object because it is accessible thorought out the application
        companion object{
          //now we have have path and paint brush.
            var path=Path()
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
            Toast.makeText(this,"You Pick Red",Toast.LENGTH_SHORT).show()
            PaintBrush.setColor(Color.RED)
            currentcolor(PaintBrush.color)
        }
        bluebtn.setOnClickListener {
            Toast.makeText(this,"You Pick Blue",Toast.LENGTH_SHORT).show()
            PaintBrush.setColor(Color.BLUE)
            currentcolor(PaintBrush.color)
        }
        blackbtn.setOnClickListener {
            Toast.makeText(this,"You Pick Black",Toast.LENGTH_SHORT).show()
            PaintBrush.setColor(Color.BLACK)
            currentcolor(PaintBrush.color)
        }
        eraser.setOnClickListener {
            Toast.makeText(this,"Erase All",Toast.LENGTH_SHORT).show()
        pathList.clear()
            colorList.clear()
            path.reset()
        }
    }
        private  fun currentcolor(color:Int){
// currentbrush export Paintview.kt file
            currnetBrush = color
            path = Path()
        }

}