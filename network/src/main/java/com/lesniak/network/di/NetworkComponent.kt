package com.lesniak.network.di

import com.lesniak.network.api.ApiService
import dagger.Component

@Component(modules = [ApiModule::class])
@NetworkScope
interface NetworkComponent {

    companion object {
        val BUILDER = DaggerNetworkComponent.builder()
    }

    fun apiService(): ApiService
}