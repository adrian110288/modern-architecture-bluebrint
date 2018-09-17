package com.lesniak.modern_architecture_blueprint

import android.app.Application
import com.lesniak.network.di.NetworkComponent

class MyApplication : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
                .networkComponent(NetworkComponent.INSTANCE)
                .appModule(AppModule(this))
                .build()
    }
}