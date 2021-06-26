package com.example.myapplication.services.ServiceCliente

import com.example.myapplication.models.entity.Cliente
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiServiceCliente {
    @POST(".")
    fun GrabarCliente(@Body cliente: Cliente?): Call<Cliente>

    @GET(".")
    fun listaCliente(): Call<List<Cliente>>
}