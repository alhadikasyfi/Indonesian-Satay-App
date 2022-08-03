package io.submission.indonesiansatay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val ivLogo = findViewById<ImageView>(R.id.iv_splashScreen)
        ivLogo.alpha = 0f
        ivLogo.animate().setDuration(2000).alpha(1f).withEndAction{
            val toMainActivity = Intent(this@SplashScreenActivity, MainActivity::class.java)
            startActivity(toMainActivity)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }
}