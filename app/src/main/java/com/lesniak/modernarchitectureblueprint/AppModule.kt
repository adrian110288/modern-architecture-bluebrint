package com.lesniak.modernarchitectureblueprint

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val application: Application) {

    @Provides
    @AppScope
    fun application() = application
}