package com.rodrigo.applicationworkapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rodrigo.applicationworkapi.api.MyRetrofit
import com.rodrigo.applicationworkapi.model.Produto
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var recycleProdutos: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleProdutos = findViewById(R.id.recycle_rodutos)
        recycleProdutos.layoutManager = LinearLayoutManager(this)
        getData()
    }
    private fun getData(){
        val call: Call<List<Produto>> = MyRetrofit.instance?.produtoApi()?.getProdutoApi() as Call<List<Produto>>

        call.enqueue(object: Callback<List<Produto>>{
            override fun onResponse(call: Call<List<Produto>>, response: Response<List<Produto>>) {
                val adapter = ProdutosAdapter(this@MainActivity, response.body()?.toList() as List<Produto>)

                recycleProdutos.adapter = adapter
            }

            override fun onFailure(call: Call<List<Produto>>, t: Throwable) {
                Toast.makeText(this@MainActivity, t.message, Toast.LENGTH_LONG).show()
            }

        })
    }
}