package com.luiz.mobilechallenge.view.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.luiz.mobilechallenge.R

class Inicio : AppCompatActivity() {


    @SuppressLint("SourceLockedOrientationActivity")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
        supportActionBar?.hide()


        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        // supportActionBar.hide()

        Handler().postDelayed({
            val i = Intent(this@Inicio, MainActivity::class.java)
            startActivity(i)
            finish()
        }, SPLASH_TIME_OUT.toLong())
    }

    companion object {
        //Timer da splash screen
        private const val SPLASH_TIME_OUT = 2000
    }
}

