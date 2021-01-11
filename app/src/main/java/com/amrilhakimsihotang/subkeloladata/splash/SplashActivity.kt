package com.amrilhakimsihotang.subkeloladata.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amrilhakimsihotang.subkeloladata.R
import com.amrilhakimsihotang.subkeloladata.home.HomeActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val background = object : Thread() {
            override fun run() {
                try {
                    sleep(3000)
                    val mIntent = Intent(baseContext, HomeActivity::class.java)
                    startActivity(mIntent)
                    this@SplashActivity.finish()
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}