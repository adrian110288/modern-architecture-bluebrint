package com.lesniak.modernarchitectureblueprint

import android.app.Application
import com.lesniak.data.di.DataComponent

class MyApplication : Application() {

    companion object {
        lateinit var INSTANCE: MyApplication
            private set
    }

    init {
        INSTANCE = this
    }

    val appComponent: AppComponent by lazy {

        val dataComponent = DataComponent.BUILDER.build()

        DaggerAppComponent.builder()
            .dataComponent(dataComponent)
            .appModule(AppModule(this))
            .build()
    }
}