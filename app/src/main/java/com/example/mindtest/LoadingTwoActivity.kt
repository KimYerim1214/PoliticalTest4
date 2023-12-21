package com.example.mindtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.mindtest.databinding.ActivityLoadingBinding
import com.example.mindtest.databinding.ActivityLoadingTwoBinding

class LoadingTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoadingTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var receivecnt : Int = intent.getIntExtra("cnt",0)


        Handler().postDelayed({
            val intent = Intent(this@LoadingTwoActivity, LoadingThreeActivity::class.java)
            intent.putExtra("cnt", receivecnt)
            startActivity(intent)
        }, 1000)

    }
}