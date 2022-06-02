package com.example.concatadapter.main.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.concatadapter.R
import com.example.concatadapter.databinding.ItemLayoutBannerBinding
import com.example.concatadapter.main.model.CommercialBanner

class BannerAdapter(
    private val commercialBanner: CommercialBanner
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class BannerViewHolder(
        private val binding: ItemLayoutBannerBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(banner: CommercialBanner) {
            with(binding) {
                Glide.with(imageViewBanner.context)
                    .load(banner.bannerImage)
                    .into(imageViewBanner)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        when (viewType) {
            R.layout.item_layout_banner -> BannerViewHolder(parent)
            else -> throw IllegalStateException("Unknown view type: $viewType")
        }

    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
        when (holder) {
            is BannerViewHolder -> holder.bind(commercialBanner)
            else -> { throw IllegalStateException("Unknown holde type: $commercialBanner")}
        }

}