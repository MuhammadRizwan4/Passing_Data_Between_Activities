package com.example.muhammadrizwan.passing_data_between_activities

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var text :EditText
    lateinit var button :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.Ed_1)
        button = findViewById(R.id.btn1)

        button.setOnClickListener {

            val msg : String = Ed_1.text.toString()

            var intent = Intent(this,Receiver_Activity::class.java)

            intent.putExtra("user_input",msg)
            startActivity(intent)
        }


    }
}
