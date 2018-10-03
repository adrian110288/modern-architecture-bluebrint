package com.lesniak.api.network

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [GsonModule::class])
class RetrofitModule {

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
        okHttpClient: OkHttpClient,
        @BaseUrl baseUrl: String
    ) =

        Retrofit.Builder()
            .addConverterFactory(gsonConverterFactory)
            .addCallAdapterFactory(rxJavaCallAdapterFactory)
            .baseUrl(baseUrl)
            .client(okHttpClient)
            .build()
}