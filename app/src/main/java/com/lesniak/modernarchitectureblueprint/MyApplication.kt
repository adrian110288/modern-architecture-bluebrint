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

//    val appComponent: AppComponent by lazy {
//
//        val dataComponent = DataComponent.BUILDER.build()
//
//        DaggerAppComponent.builder()
//            .dataComponent(dataComponent)
//            .appModule(AppModule(this))
//            .build()
//    }
}