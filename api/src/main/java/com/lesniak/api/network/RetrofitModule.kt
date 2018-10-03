package com.lesniak.api.network

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level.BASIC
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module(includes = [GsonModule::class])
class RetrofitModule {

    companion object {
        const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    }

    @Provides
    @Singleton
    fun okHttp(
        interceptor: HttpRequestInterceptor,
        loggingInterceptor: HttpLoggingInterceptor
    ) =
        OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .addInterceptor(loggingInterceptor)
            .build()

    @Provides
    @Singleton
    fun loggingInterceptor() =
        HttpLoggingInterceptor().apply { level = BASIC }

    @Provides
    @Singleton
    fun rxAdapterFactory() =
        RxJava2CallAdapterFactory.create()

    @Provides
    @Singleton
    fun retrofit(
        gsonConverterFactory: GsonConverterFactory,
        rxJavaCallAdapterFactory: RxJava2CallAdapterFactory,
        okHttpClient: OkHttpClient
    ) =

        Retrofit.Builder()
            .addConverterFactory(gsonConverterFactory)
            .addCallAdapterFactory(rxJavaCallAdapterFactory)
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .build()
}