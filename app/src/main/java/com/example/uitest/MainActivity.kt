package com.example.uitest

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.uitest.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnMainActivity.setOnClickListener{
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}
