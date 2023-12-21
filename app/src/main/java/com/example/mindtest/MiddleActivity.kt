package com.example.mindtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mindtest.databinding.ActivityMainBinding
import com.example.mindtest.databinding.ActivityMiddleBinding

class MiddleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMiddleBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}