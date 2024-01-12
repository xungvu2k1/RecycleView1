package com.example.recycleview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var rcvUser : RecyclerView
    private lateinit var mUserAdapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcvUser = findViewById(R.id.rcv_user)
        mUserAdapter = UserAdapter(this)

        val gridLayoutManager = GridLayoutManager(this, 3)
//        val linearLayoutManager = LinearLayoutManager(this)
        rcvUser.layoutManager = gridLayoutManager

        mUserAdapter.setData(getUserList())
        rcvUser.adapter = mUserAdapter
    }

    private fun getUserList() : List<User>{
        val userList : MutableList<User> = ArrayList()
        userList.add(User(R.drawable.img_8, "son tung"))
        userList.add(User(R.drawable.img_3, "jack"))
        userList.add(User(R.drawable.img_2, "issac"))
        userList.add(User(R.drawable.img_6, "mono"))

        userList.add(User(R.drawable.img_1, "cong phuong"))
        userList.add(User(R.drawable.img_5, "messi"))
        userList.add(User(R.drawable.img_7, "ronaldo"))
        userList.add(User(R.drawable.img_4, "mbappe"))

        userList.add(User(R.drawable.img_1, "cong phuong"))
        userList.add(User(R.drawable.img_3, "jack"))
        userList.add(User(R.drawable.img_2, "issac"))
        userList.add(User(R.drawable.img_4, "mbappe"))
        return userList
    }
}