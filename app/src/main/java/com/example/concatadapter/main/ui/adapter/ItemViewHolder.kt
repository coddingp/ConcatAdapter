package com.example.concatadapter.main.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.concatadapter.databinding.ItemLayoutBinding
import com.example.concatadapter.main.model.User

class ItemViewHolder(private val binding: ItemLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {

//    private val users = mutableListOf<User>()
//
//    private val userAdapter: UsersAdapter by lazy {
//        UsersAdapter(users)
//    }

    constructor(
        parent: ViewGroup,
    ) : this(
        ItemLayoutBinding.inflate(
            LayoutInflater.from(
                parent.context
            ), parent, false
        )
    )

    fun bind(user: User) {
        with(binding) {
            textViewUserName.text = user.name
            Glide.with(imageViewAvatar.context)
                .load(user.avatar)
                .into(imageViewAvatar)
        }
    }
}