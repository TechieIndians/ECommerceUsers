package com.techieIndians.ecommerceuser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_clk = findViewById<Button>(R.id.btn_clk)
        btn_clk.setOnClickListener{
            startActivity(Intent(this, NewActivity::class.java))
        }
    }
}