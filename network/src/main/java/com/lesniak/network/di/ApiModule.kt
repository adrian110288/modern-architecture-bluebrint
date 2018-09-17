package com.lesniak.network.di

import com.lesniak.network.api.ApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [RetrofitModule::class])
class ApiModule {

    @Provides
    @Singleton
    fun apiService(retrofit: Retrofit) =
            retrofit.create(ApiService::class.java)
}