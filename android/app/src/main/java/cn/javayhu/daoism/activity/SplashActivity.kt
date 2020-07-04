package cn.javayhu.daoism.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import cn.javayhu.daoism.R
import kotlinx.android.synthetic.main.activity_splash.*
import library.router.Intents

/**
 * link: https://proandroiddev.com/android-motionlayout-twitter-splash-screen-b5755ed56ee8
 * link: https://medium.com/@shishirthedev/the-right-way-to-implement-a-splash-screen-in-android-acae0e52949a
 */
class SplashActivity : AppCompatActivity(R.layout.activity_splash) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        splashMotionLayout.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                startActivity(Intents.openHomeIntent(this@SplashActivity))
                this@SplashActivity.finish()
            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) { }

            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) { }

            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) { }
        })
        splashMotionLayout.transitionToEnd()
    }
}