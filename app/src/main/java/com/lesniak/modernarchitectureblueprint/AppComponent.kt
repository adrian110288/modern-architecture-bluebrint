package com.lesniak.modernarchitectureblueprint

import dagger.Component

@Component(
//        dependencies = [NetworkComponent::class],
    modules = [AppModule::class]
)
@AppScope
interface AppComponent {

    fun inject(mainActivity: MainActivity)
}