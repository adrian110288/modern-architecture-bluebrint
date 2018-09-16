package com.lesniak.network

import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

@Component(modules = [RetrofitModule::class])
@Singleton
interface NetworkComponent {

    fun retrofit(): Retrofit
}