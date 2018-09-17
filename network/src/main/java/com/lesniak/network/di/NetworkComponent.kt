package com.lesniak.network.di

import com.lesniak.network.BuildConfig
import com.lesniak.network.api.ApiService
import dagger.Component

@Component(modules = [ApiModule::class])
@NetworkScope
interface NetworkComponent {

    companion object {

        //        TODO Good idea?
        val INSTANCE: NetworkComponent by lazy {
            DaggerNetworkComponent.builder()
                    .retrofitModule(RetrofitModule(BuildConfig.API_KEY))
                    .build()
        }
    }

    fun apiService(): ApiService
}