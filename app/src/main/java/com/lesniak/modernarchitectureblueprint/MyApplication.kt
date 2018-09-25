package com.lesniak.modernarchitectureblueprint

import android.app.Application

class MyApplication : Application() {

    companion object {
        lateinit var INSTANCE: MyApplication
            private set
    }

    init {
        INSTANCE = this
    }

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
//                .networkComponent(NetworkComponent.INSTANCE)
            .appModule(AppModule(this))
            .build()
    }
}