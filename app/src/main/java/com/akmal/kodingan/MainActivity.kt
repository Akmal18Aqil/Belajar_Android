package com.akmal.kodingan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private lateinit var btnHitungLuas: Button
    private lateinit var btnPindahFragment: Button
    private lateinit var btnFragmentCuy: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        btnHitungLuas = findViewById(R.id.button)
        btnPindahFragment = findViewById(R.id.button1)
        btnFragmentCuy = findViewById(R.id.button2)


        btnHitungLuas.setOnClickListener {
            val moveIntent = Intent(this@MainActivity, HitunganActivity::class.java)
            startActivity(moveIntent)
        }
        btnPindahFragment.setOnClickListener {
            val pindahAja = Intent(this@MainActivity, Fragment_mainActivity::class.java)
            startActivity(pindahAja)
        }

        btnFragmentCuy.setOnClickListener {
            val pindahYok = Intent(this@MainActivity, FragmenSayaActivity::class.java)
            startActivity(pindahYok)
        }

    }
}