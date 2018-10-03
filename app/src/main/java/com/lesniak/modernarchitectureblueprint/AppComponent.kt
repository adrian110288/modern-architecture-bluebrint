package com.lesniak.modernarchitectureblueprint

import com.lesniak.data.di.DataModule
import dagger.Component

@Component(
    modules = [
        com.lesniak.api.network.NetworkModule::class,
        DataModule::class,
        AppModule::class]
)
@AppScope
interface AppComponent {

    fun inject(mainActivity: MainActivity)
}