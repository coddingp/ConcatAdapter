package com.example.concatadapter.main.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.concatadapter.R
import com.example.concatadapter.databinding.ItemLayoutBannerBinding
import com.example.concatadapter.databinding.ItemLayoutUserDetailsBinding
import com.example.concatadapter.main.model.CommercialBanner
import com.example.concatadapter.main.model.UserDetails
import com.example.concatadapter.utils.DataSource

class BannerViewHolder(
    private val binding: ItemLayoutBannerBinding
) : RecyclerView.ViewHolder(binding.root) {

    private val adapter: UserDetailAdapter by lazy {
        UserDetailAdapter(UserDetails())
    }

    constructor(
        parent: ViewGroup,
    ) : this(
        ItemLayoutBannerBinding.inflate(
            LayoutInflater.from(
                parent.context
            ), parent, false
        )
    )

    fun bind(commercialBanner: CommercialBanner) {
            with(binding) {
                Glide.with(imageViewBanner.context).load(commercialBanner.bannerImage).placeholder(R.drawable.ic_launcher_foreground).into(imageViewBanner)
        }
    }
}