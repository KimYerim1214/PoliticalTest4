package com.example.mindtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.mindtest.databinding.ActivityLoadingBinding
import com.example.mindtest.databinding.ActivityLoadingThreeBinding

class LoadingThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoadingThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var receivecnt : Int = intent.getIntExtra("cnt",0)


        Handler().postDelayed({

            val intent : Intent
            when(receivecnt){
                in -8 .. -5-> {
                    val intent = Intent(this@LoadingThreeActivity, BosuActivity::class.java)
                    startActivity(intent)
                }
                in -4 ..-1-> {
                    val intent = Intent(this@LoadingThreeActivity, MiddleBosuActivity::class.java)
                    startActivity(intent)
                }
                0 -> {
                    val intent = Intent(this@LoadingThreeActivity, MiddleActivity::class.java)
                    startActivity(intent)
                }
                in 1..4 -> {
                    val intent = Intent(this@LoadingThreeActivity, MiddleJinboActivity::class.java)
                    startActivity(intent)
                }
                in 5 .. 8->{
                    val intent = Intent(this@LoadingThreeActivity, JinboActivity::class.java)
                    startActivity(intent)
                }


            }

        }, 1000)

    }
}