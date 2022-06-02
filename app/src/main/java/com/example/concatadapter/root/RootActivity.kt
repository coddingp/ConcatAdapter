package com.example.concatadapter.root

//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import androidx.recyclerview.widget.ConcatAdapter
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.concatadapter.R
//import com.example.concatadapter.main.model.UserDetails
//import com.example.concatadapter.main.ui.adapter.BannerAdapter
//import com.example.concatadapter.main.ui.adapter.UserDetailAdapter
//import com.example.concatadapter.main.ui.adapter.UsersAdapter
//import com.example.concatadapter.utils.DataSource
//import kotlinx.android.synthetic.main.activity_root.*
//
//class RootActivity : AppCompatActivity() {
//
//    private lateinit var concatAdapter: ConcatAdapter
//    private lateinit var userDetailAdapter: UserDetailAdapter
//    private lateinit var userVerticalAdapter: UsersAdapter
//    private lateinit var bannerAdapter: BannerAdapter
//    private val userDetails =
//        UserDetails(1, "Himanshu Singh", "I am an writer and Open Source contributor in MindOrks.")
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_root)
//        setupDataInRecyclerView()
//    }
//
//    private fun setupDataInRecyclerView() {
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        userVerticalAdapter = UsersAdapter(DataSource.getUser())
//        bannerAdapter = BannerAdapter(DataSource.getBanner())
//        userDetailAdapter = UserDetailAdapter(userDetails)
//        val listOfAdapters = listOf(userDetailAdapter, userVerticalAdapter, bannerAdapter)
//        concatAdapter = ConcatAdapter(listOfAdapters)
//        recyclerView.adapter = concatAdapter
//
//    }
//}
//
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.concatadapter.databinding.ActivityRootBinding
import com.example.concatadapter.main.model.UserDetails
import com.example.concatadapter.main.ui.adapter.BannerAdapter
import com.example.concatadapter.main.ui.adapter.UserDetailAdapter
import com.example.concatadapter.main.ui.adapter.UsersAdapter
import com.example.concatadapter.utils.DataSource
import kotlinx.android.synthetic.main.activity_root.*

class RootActivity : AppCompatActivity() {

    private val binding: ActivityRootBinding by lazy {
        ActivityRootBinding.inflate(layoutInflater)
    }

    lateinit var concatAdapter: ConcatAdapter
    lateinit var userDetailAdapter: UserDetailAdapter
    lateinit var userVerticalAdapter: UsersAdapter
    lateinit var bannerAdapter: BannerAdapter

    val userDetails =
        UserDetails(1, "Himanshu Singh", "I am an writer and Open Source contributor in MindOrks.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupDataInRecyclerView()
    }

    private fun setupDataInRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        userVerticalAdapter = UsersAdapter(DataSource.getUser())
        bannerAdapter = BannerAdapter(DataSource.getBanner())
        userDetailAdapter = UserDetailAdapter(userDetails)
        concatAdapter = ConcatAdapter(userDetailAdapter, userVerticalAdapter, bannerAdapter)
//        recyclerView.adapter = concatAdapter
    }
}