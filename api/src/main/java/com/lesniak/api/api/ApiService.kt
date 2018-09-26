package com.lesniak.api.api

import retrofit2.http.GET
import java.util.*

interface ApiService {

    @GET("/")
    fun getData(): Observable
}