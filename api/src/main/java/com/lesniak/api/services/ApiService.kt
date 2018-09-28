package com.lesniak.api.services

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/")
    fun getData(): Response<Void>
}