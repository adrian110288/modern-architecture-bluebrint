package com.lesniak.network.api

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module(includes = [com.lesniak.network.di.RetrofitModule::class])
class ApiModule {

    @Provides
    @com.lesniak.network.di.NetworkScope
    fun apiService(retrofit: Retrofit) =
        retrofit.create(ApiService::class.java)
}