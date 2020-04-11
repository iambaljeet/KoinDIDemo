package com.app.koindidemo.app

import android.app.Application
import com.app.koindidemo.di.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()

        val moduleList = listOf(mainModule)

        // start Koin!
        startKoin {
            androidLogger()
            // declare used Android context
            androidContext(this@MyApp)
            // declare modules
            modules(moduleList)
        }
    }
}