package com.example.uitest

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.uitest.databinding.SecondActivityBinding

class SecondActivity : ComponentActivity() {
    private lateinit var binding: SecondActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSecondActivity.setOnClickListener{
            onBackPressedDispatcher.onBackPressed()
//            onBackPressedDispatcher.addCallback(this /* lifecycle owner */, object : OnBackPressedCallback(true) {
//                override fun handleOnBackPressed() {
//                    // Back is pressed... Finishing the activity
//                    finish()
//                }
//            })
        }
    }
}
