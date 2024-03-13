package com.akmal.kodingan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akmal.kodingan.databinding.ActivityHitunganBinding

class HitunganActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHitunganBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHitunganBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCalculate.setOnClickListener {
            val inputPanjang = binding.edtPanjang.text.toString().trim()
            val inputLebar = binding.edtLebar.text.toString().trim()
            val luas = inputPanjang.toDouble() * inputLebar.toDouble()
            binding.tvResult.text = luas.toString()
        }
    }
}