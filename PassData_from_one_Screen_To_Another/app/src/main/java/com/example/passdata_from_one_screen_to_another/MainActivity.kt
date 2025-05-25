package com.example.passdata_from_one_screen_to_another

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btnOrder
import kotlinx.android.synthetic.main.activity_main.eT1
import kotlinx.android.synthetic.main.activity_main.eT2
import kotlinx.android.synthetic.main.activity_main.eT3
import kotlinx.android.synthetic.main.activity_main.eT4

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnOrder.setOnClickListener {
            val oderlist =  eT1.text.toString() + " " + eT2.text.toString() + " " + eT3.text.toString() + " " + eT4.text

            intent= Intent(this,Oder::class.java)

        }
    }

}