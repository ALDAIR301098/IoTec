package com.softgames.iotec.presentation.authentication.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.softgames.iotec.base.BaseActivity
import com.softgames.iotec.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}