package com.example.mindtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mindtest.databinding.ActivityMainBinding
import com.example.mindtest.databinding.ActivityMiddleBosuBinding
import com.example.mindtest.databinding.ActivityMiddleJinboBinding

class MiddleJinboActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMiddleJinboBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}