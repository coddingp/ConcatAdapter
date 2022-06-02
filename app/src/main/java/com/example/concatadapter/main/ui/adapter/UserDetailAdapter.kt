package com.example.concatadapter.main.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.concatadapter.R
import com.example.concatadapter.main.model.UserDetails

class UserDetailAdapter(
    private val userDetails: UserDetails
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(parent)

    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is DataViewHolder -> holder.bind(userDetails)
        }
    }
}