package com.example.concatadapter.main.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.concatadapter.databinding.ItemLayoutUserDetailsBinding
import com.example.concatadapter.main.model.UserDetails

class DataViewHolder(
    private val binding: ItemLayoutUserDetailsBinding
) : RecyclerView.ViewHolder(binding.root) {

//    private val adapter: UserDetailAdapter by lazy {
//        UserDetailAdapter(UserDetails())
//    }

    constructor(
        parent: ViewGroup,
    ) : this(
        ItemLayoutUserDetailsBinding.inflate(
            LayoutInflater.from(
                parent.context
            ), parent, false
        )
    )

    fun bind(user: UserDetails) {
        with(binding) {
            textViewUser.text = user.name
            textViewAboutMe.text = user.aboutMe
        }
    }
}