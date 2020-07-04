package library.router

import android.content.Context
import android.content.Intent

object Intents {

    private fun internalIntent(context: Context, action: String) = Intent(action).setPackage(context.packageName)

    fun openSplashIntent(context: Context): Intent = internalIntent(context, "${context.packageName}.splash.open")

    fun openHomeIntent(context: Context): Intent = internalIntent(context, "${context.packageName}.home.open")

}