package com.lesniak.data.di

import com.lesniak.data.AppDatabase
import com.lesniak.network.di.NetworkComponent
import dagger.Component

@Component(
    dependencies = [NetworkComponent::class],
    modules = [DataModule::class]
)
@DataScope
interface DataComponent {

    companion object {

        val BUILDER by lazy {

            val networkComponent = NetworkComponent.BUILDER.build()

            DaggerDataComponent.builder()
                .networkComponent(networkComponent)
        }
    }

    fun appDatabase(): AppDatabase
}