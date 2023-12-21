package com.example.mindtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.mindtest.databinding.ActivityFiveTestBinding
import com.example.mindtest.databinding.ActivityOneTestBinding

class FIveTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityFiveTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var receivecnt : Int = intent.getIntExtra("cnt",0)

        binding.agree.setOnClickListener(){
            Handler().postDelayed({
                val intent = Intent(this@FIveTestActivity, SixTestActivity::class.java)
                receivecnt++
                intent.putExtra("cnt", receivecnt)
                startActivity(intent)
            }, 100)
        }

        binding.oppo.setOnClickListener(){
            Handler().postDelayed({
                val intent = Intent(this@FIveTestActivity, SixTestActivity::class.java)
                receivecnt --
                intent.putExtra("cnt", receivecnt)
                startActivity(intent)
            }, 100)
        }

        binding.neut.setOnClickListener(){
            Handler().postDelayed({
                val intent = Intent(this@FIveTestActivity, SixTestActivity::class.java)
                intent.putExtra("cnt", receivecnt)
                startActivity(intent)
            }, 100)
        }
    }
}