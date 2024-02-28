package unconvert.com.arbaztech.climatetrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        //for splash screen
        Handler(Looper.getMainLooper()).postDelayed({
            //go to main activity page
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
            //back karenge to splash screen nahi aygi
            finish()
            //splash screen stop for 3 seconds
        },3000)

    }
}
