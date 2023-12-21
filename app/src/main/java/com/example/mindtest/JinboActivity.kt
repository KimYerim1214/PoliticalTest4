package com.example.mindtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mindtest.databinding.ActivityJinboAcitivityBinding
import com.example.mindtest.databinding.ActivityMainBinding

class JinboActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityJinboAcitivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}