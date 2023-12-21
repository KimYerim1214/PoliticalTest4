package com.example.mindtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.mindtest.databinding.ActivityMainBinding
import com.example.mindtest.databinding.ActivityOneTestBinding

class OneTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityOneTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var cnt : Int = 0

        binding.agree.setOnClickListener(){
            Handler().postDelayed({
                val intent = Intent(this@OneTestActivity, TwoTestActivity::class.java)

                cnt++
                intent.putExtra("cnt", cnt)
                startActivity(intent)
            }, 100)

        }

        binding.oppo.setOnClickListener(){
            Handler().postDelayed({
                val intent = Intent(this@OneTestActivity, TwoTestActivity::class.java)

                intent.putExtra("cnt", cnt)
                startActivity(intent)
            }, 100)

        }

        binding.neut.setOnClickListener(){
            Handler().postDelayed({
                val intent = Intent(this@OneTestActivity, TwoTestActivity::class.java)

                intent.putExtra("cnt", cnt)
                startActivity(intent)
            }, 100)
            cnt=0
        }
    }
}