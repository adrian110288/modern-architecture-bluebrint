package com.lesniak.network.di

import com.lesniak.network.api.ApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module(includes = [RetrofitModule::class])
class ApiModule {

    @Provides
    @NetworkScope
    fun apiService(retrofit: Retrofit) =
            retrofit.create(ApiService::class.java)
}