package com.exaple.splitwise_clone.harsh

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.exaple.splitwise_clone.R
import com.exaple.splitwise_clone.menubartrail.MenuMainActivity
import com.exaple.splitwise_clone.vinod.database.sharedpreferences.PreferenceHelper
import com.exaple.splitwise_clone.vinod.views.SplitwiseApplication
import kotlinx.android.synthetic.main.activity_first_screen.*
import java.util.*
import kotlin.concurrent.timerTask

class FirstScreen : AppCompatActivity() {

    private val preferenceHelper = PreferenceHelper(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)
        Glide.with(screen).load(R.drawable.ic_intro_screen).into(screen)
        val timer = Timer()
        timer.schedule(timerTask {
            if (!preferenceHelper.readBooleanFromPreference(SplitwiseApplication.PREF_IS_USER_LOGIN)) {
                val intent = Intent(this@FirstScreen, SplitWiseScreen::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this@FirstScreen, Welcome_Screen_1_Activity::class.java)
                startActivity(intent)
            }
            finish()
        }, 2000)
    }
}