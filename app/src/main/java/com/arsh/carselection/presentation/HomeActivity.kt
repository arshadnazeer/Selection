package com.arsh.carselection.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.arsh.carselection.R
import com.arsh.carselection.databinding.ActivityHomeBinding
import com.arsh.carselection.presentation.manufacturer.ManufacturerActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btManufacturer.setOnClickListener {
            val intent = Intent(this,ManufacturerActivity::class.java)
            startActivity(intent)        }
    }
}