package com.example.mindtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.mindtest.databinding.ActivityFiveTestBinding
import com.example.mindtest.databinding.ActivitySixTestBinding

class SixTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySixTestBinding.inflate(layoutInflater)
        var receivecnt : Int = intent.getIntExtra("cnt",0)
        setContentView(binding.root)

        binding.agree.setOnClickListener(){
            Handler().postDelayed({
                val intent = Intent(this@SixTestActivity, SevenTestActivity::class.java)
                receivecnt++
                intent.putExtra("cnt", receivecnt)
                startActivity(intent)
            }, 100)
        }

        binding.oppo.setOnClickListener(){
            Handler().postDelayed({
                val intent = Intent(this@SixTestActivity, SevenTestActivity::class.java)
                receivecnt --
                intent.putExtra("cnt", receivecnt)
                startActivity(intent)
            }, 100)
        }

        binding.neut.setOnClickListener(){
            Handler().postDelayed({
                val intent = Intent(this@SixTestActivity, SevenTestActivity::class.java)
                intent.putExtra("cnt", receivecnt)
                startActivity(intent)
            }, 100)
        }
    }
}