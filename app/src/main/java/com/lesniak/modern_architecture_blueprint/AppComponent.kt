package com.lesniak.modern_architecture_blueprint

import com.lesniak.network.di.NetworkComponent
import dagger.Component

@Component(
        dependencies = [NetworkComponent::class],
        modules = [AppModule::class])
@AppScope
interface AppComponent {

    fun inject(mainActivity: MainActivity)
}