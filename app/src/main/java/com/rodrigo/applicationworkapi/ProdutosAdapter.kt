package com.rodrigo.applicationworkapi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rodrigo.applicationworkapi.model.Produto

class ProdutosAdapter(
    private val context: Context,
    private val produtoList: List<Produto>
    , ): RecyclerView.Adapter<ProdutosViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutosViewHolder =
        ProdutosViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.produto_item, parent, false))


    override fun onBindViewHolder(holder: ProdutosViewHolder, position: Int) {

        val item = produtoList[position]
        holder.produtoNome.text = item.prName
        holder.produtoPreco.text = item.prPrice
        Glide.with(context).load(item.prImage).into(holder.produtoImage)
    }

    override fun getItemCount(): Int = produtoList.size

}

class ProdutosViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val produtoImage: ImageView = itemView.findViewById(R.id.imgProduto)
    val produtoNome: TextView = itemView.findViewById(R.id.nomeProduto)
    val produtoPreco: TextView = itemView.findViewById(R.id.precoProduto)

}