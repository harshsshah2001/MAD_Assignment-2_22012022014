package com.example.mad_assignment_2_22012022014

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mad_assignment_2_22012022014.R.id.btnclick

class Signin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        val bttn=findViewById<Button>(btnclick);
        bttn.setOnClickListener{

            bttn.setOnClickListener{
                val Intent = Intent(this,MainActivity::class.java).also{startActivity(it)}

            }

        }
    }
}