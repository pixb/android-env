package com.pix.androidenv

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.pix.androidenv.ext.dp
import com.pix.androidenv.ext.screenHeight
import com.pix.androidenv.ext.screenWidth
import com.pix.androidenv.ext.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tvInfo1).apply {
            text = "屏幕分辨率: ${screenWidth()} x ${screenHeight()}"
        }
        findViewById<TextView>(R.id.tvInfo2).apply {
            text = "1dp = ${1.dp}px, 1sp = ${1.sp}px"
        }

        findViewById<TextView>(R.id.tvInfo3).apply {
            text = "屏幕密度：${Resources.getSystem().displayMetrics}"
        }
    }
}