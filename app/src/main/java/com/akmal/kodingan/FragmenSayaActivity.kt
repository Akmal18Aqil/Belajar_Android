package com.akmal.kodingan

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class FragmenSayaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragmen_saya)

        val framentManager = supportFragmentManager
        val latihanFragment = LatihanFragment()
        val fragment = framentManager.findFragmentByTag(LatihanFragment::class.java.simpleName)

        if (fragment !is LatihanFragment){
            Log.d("Fragmentkuu", "Nama:" + LatihanFragment::class.java.simpleName)
            framentManager
                .beginTransaction()
                .add(R.id.frame_fragmen, latihanFragment, LatihanFragment::class.java.simpleName)
                .commit()
        }
    }
}