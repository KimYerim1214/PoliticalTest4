package com.example.mindtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.mindtest.databinding.ActivityEightTestBinding
import com.example.mindtest.databinding.ActivityMainBinding

class EightTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityEightTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var receivecnt : Int = intent.getIntExtra("cnt",0)

        binding.agree.setOnClickListener(){
            Handler().postDelayed({
                val intent = Intent(this@EightTestActivity, LoadingActivity::class.java)
                receivecnt++
                intent.putExtra("cnt", receivecnt)
                startActivity(intent)
            }, 2000)
        }

        binding.oppo.setOnClickListener(){
            Handler().postDelayed({
                val intent = Intent(this@EightTestActivity, LoadingActivity::class.java)
                receivecnt --
                intent.putExtra("cnt", receivecnt)
                startActivity(intent)
            }, 2000)
        }

        binding.neut.setOnClickListener(){
            Handler().postDelayed({
                val intent = Intent(this@EightTestActivity, LoadingActivity::class.java)
                intent.putExtra("cnt", receivecnt)
                startActivity(intent)
            }, 2000)
        }



    }
}