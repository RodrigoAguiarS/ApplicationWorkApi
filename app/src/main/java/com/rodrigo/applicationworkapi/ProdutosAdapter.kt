package com.rodrigo.applicationworkapi

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rodrigo.applicationworkapi.model.Produto

class ProdutosAdapter(
    private val context: Context,
    private val produtoList: List<Produto>
    , ): RecyclerView.Adapter<ProdutosViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutosViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ProdutosViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}

class ProdutosViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

}