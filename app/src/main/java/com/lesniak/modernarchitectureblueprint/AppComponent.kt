package com.lesniak.modernarchitectureblueprint

import dagger.Component

@Component(
    dependencies = [DataComponent::class],
    modules = [AppModule::class]
)
@AppScope
interface AppComponent {

    fun inject(mainActivity: MainActivity)
}