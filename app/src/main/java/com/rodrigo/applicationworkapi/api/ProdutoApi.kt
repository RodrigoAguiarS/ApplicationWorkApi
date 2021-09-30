package com.rodrigo.applicationworkapi.api


import com.rodrigo.applicationworkapi.model.Produto
import retrofit2.http.GET
import retrofit2.Call

interface ProdutoApi {
    @GET("getdata.php")
    fun getProdutoApi(): Call<List<Produto>>
}