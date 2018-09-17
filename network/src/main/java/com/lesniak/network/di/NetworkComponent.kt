package com.lesniak.network.di

import com.lesniak.network.api.ApiService
import dagger.Component

@Component(modules = [ApiService::class])
interface NetworkComponent {

    fun apiService(): ApiService
}