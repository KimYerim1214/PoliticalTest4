package com.example.mindtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.mindtest.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.starttestbt.setOnClickListener(){
            Handler().postDelayed({
                val intent = Intent(this@WelcomeActivity, OneTestActivity::class.java)
                startActivity(intent)
            }, 100)
        }
    }
}