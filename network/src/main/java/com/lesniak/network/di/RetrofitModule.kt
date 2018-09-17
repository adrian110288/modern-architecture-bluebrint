package com.lesniak.network.di

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level.BASIC
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named

@Module(includes = [GsonModule::class])
class RetrofitModule(private val apiKey: String) {

    @Provides
    @NetworkScope
    @Named("apiKey")
    fun apiKey() = apiKey

    @Provides
    @NetworkScope
    fun okHttp(interceptor: HttpRequestInterceptor,
               loggingInterceptor: HttpLoggingInterceptor) =
            OkHttpClient.Builder()
                    .addInterceptor(interceptor)
                    .addInterceptor(loggingInterceptor)
                    .build()

    @Provides
    @NetworkScope
    fun loggingInterceptor() =
            HttpLoggingInterceptor().apply { level = BASIC }

    @Provides
    @NetworkScope
    fun rxAdapterFactory() = RxJava2CallAdapterFactory.create()

    @Provides
    @NetworkScope
    fun retrofit(gsonConverterFactory: GsonConverterFactory,
                 rxJavaCallAdapterFactory: RxJava2CallAdapterFactory,
                 okHttpClient: OkHttpClient) =

            Retrofit.Builder()
                    .addConverterFactory(gsonConverterFactory)
                    .addCallAdapterFactory(rxJavaCallAdapterFactory)
//                    TODO Find better way to inject base url
                    .baseUrl("https://jsonplaceholder.typicode.com/")
                    .client(okHttpClient)
                    .build()
}