package com.example.muhammadrizwan.passing_data_between_activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_receiver_.*

class Receiver_Activity : AppCompatActivity() {

    lateinit var tv :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiver_)

        setContentView(R.layout.activity_receiver_)

        tv = findViewById(R.id.R_TV)

        var bundle :Bundle? = intent.extras
        var msg = bundle!!.getString("user_input")
        R_TV.text = msg



    }
}
