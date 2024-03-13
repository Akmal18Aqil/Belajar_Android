package com.akmal.kodingan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private lateinit var btnHitungLuas: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        btnHitungLuas = findViewById(R.id.button)

        btnHitungLuas.setOnClickListener {
            val moveIntent = Intent(this@MainActivity, HitunganActivity::class.java)
            startActivity(moveIntent)
        }

    }
}