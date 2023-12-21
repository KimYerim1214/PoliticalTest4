package com.example.mindtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mindtest.databinding.ActivityBosuBinding
import com.example.mindtest.databinding.ActivityMainBinding

class BosuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityBosuBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}