package com.example.quickydo

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.annotation.RequiresApi

class splash : AppCompatActivity() {


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(1)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        getWindow().setStatusBarColor(Color.TRANSPARENT)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            val intent = Intent(this@splash, taskhomepage::class.java)
            startActivity(intent)
        },3000)
    }
}
