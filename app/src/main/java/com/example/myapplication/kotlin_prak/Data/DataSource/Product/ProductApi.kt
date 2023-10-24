package com.example.kotlin_prak.Data.DataSource.Product

import retrofit2.http.GET

interface ProductApi {
    @GET("products")
    suspend fun getAllProduct(): Products
}