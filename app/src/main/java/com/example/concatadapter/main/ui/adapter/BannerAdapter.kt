package com.example.concatadapter.main.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.concatadapter.R
import com.example.concatadapter.main.model.CommercialBanner

class BannerAdapter(
    private val commercialBanner: CommercialBanner
) : RecyclerView.Adapter<BannerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        BannerViewHolder(parent)

    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int){
        holder.bind(commercialBanner)
        }

}