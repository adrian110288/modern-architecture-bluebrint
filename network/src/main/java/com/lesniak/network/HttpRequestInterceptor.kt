package com.lesniak.network

import com.lesniak.network.di.ApiKey
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HttpRequestInterceptor @Inject constructor(@ApiKey private val apiKey: String) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {

        val original = chain.request()

        val url = original.url()
            .newBuilder()
            .addQueryParameter("apiKey", apiKey)
            .build()

        val requestBuilder = original.newBuilder()
            .url(url)

        val request = requestBuilder.build()
        return chain.proceed(request)
    }
}