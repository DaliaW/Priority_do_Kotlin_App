package com.example.quickydo

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class register : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        var emailreg: EditText
        var passreg: EditText
        var regButton: Button
        var alreadyacc: ImageView

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        getWindow().setStatusBarColor(Color.TRANSPARENT)
    }
}
