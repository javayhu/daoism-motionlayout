package cn.javayhu.daoism

import android.app.Application
import timber.log.Timber

class DaoismApplication: Application() {

    companion object {
        lateinit var application: Application
    }

    override fun onCreate() {
        super.onCreate()
        application = this

        Timber.plant(Timber.DebugTree())
    }

}