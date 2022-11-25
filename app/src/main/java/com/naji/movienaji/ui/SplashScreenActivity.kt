package com.naji.movienaji.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import com.naji.movienaji.R
import com.naji.movienaji.ui.main.MainActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        GlobalScope.launch(Dispatchers.IO) {
            delay(2500)
            MainActivity.start(this@SplashScreenActivity)
            finish()
        }

    }
}