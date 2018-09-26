package com.lesniak.modernarchitectureblueprint

import com.lesniak.data.di.DataModule
import com.lesniak.network.di.NetworkModule
import dagger.Component

@Component(
    modules = [
        NetworkModule::class,
        DataModule::class,
        AppModule::class]
)
@AppScope
interface AppComponent {

    fun inject(mainActivity: MainActivity)
}