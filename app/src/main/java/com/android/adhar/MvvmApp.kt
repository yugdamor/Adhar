package com.android.adhar

import android.app.Application
import com.android.adhar.utils.AppModule
import org.koin.core.context.startKoin

class MvvmApp:Application()
{
    override fun onCreate() {
        super.onCreate()

        startKoin{
            this@MvvmApp
            modules(AppModule)
        }
    }
}