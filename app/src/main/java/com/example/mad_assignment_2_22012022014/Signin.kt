package com.example.mad_assignment_2_22012022014

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.mad_assignment_2_22012022014.R.id.btnclick
import java.util.jar.Attributes.Name

class Signin : AppCompatActivity() {
//    private  lateinit var Username:EditText
//    private  lateinit var Email:EditText
//    private  lateinit var Password:EditText
//    private  lateinit var Retype_password:EditText
//    private  lateinit var Mobile:EditText
//    private lateinit var btnclick:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        val bttn=findViewById<Button>(btnclick);
//        Username = findViewById(R.id.Username)
//        Email = findViewById(R.id.Email)
//        Password = findViewById(R.id.Password)
//        Retype_password = findViewById(R.id.Retype_password)
//        btnclick = findViewById(R.id.btnclick)
        bttn.setOnClickListener{

            bttn.setOnClickListener{
                val Intent = Intent(this,MainActivity::class.java).also{startActivity(it)}

            }

        }

//        btnclick.setOnClickListener {
//            val username=Username.text.toString().trim()
//            val email=Email.text.toString().trim()
//            val password=Password.text.toString().trim()
//            val re_typepassword=Retype_password.text.toString().trim()
//            val mobile=Mobile.text.toString().trim()
//
//            if (username.isEmpty()){
//                Username.error="Username is Required"
//                return@setOnClickListener
//            }
//            else if(email.isEmpty()){
//                Email.error="Email is Required"
//                return@setOnClickListener
//            }
//            else if(password.isEmpty()){
//                Password.error="Password is Require"
//                return@setOnClickListener
//            }
//            else if(re_typepassword.isEmpty()&&password!=re_typepassword){
//                Password.error="Enter a retype Password is Require or Password is Not Matched"
//                return@setOnClickListener
//            }
//            else if(mobile.isEmpty()){
//                Mobile.error="mobile Number is Require and Mobile Number Should Be 10 Digits Only"
//                return@setOnClickListener
//            }
//            else{
//                val Intent = Intent(this,MainActivity::class.java).also{startActivity(it)}
//            }
        }
    }
