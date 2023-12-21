package com.example.mindtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mindtest.databinding.ActivityMainBinding
import com.example.mindtest.databinding.ActivityMiddleBosuBinding

class MiddleBosuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMiddleBosuBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}