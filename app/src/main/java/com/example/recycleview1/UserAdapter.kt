package com.example.recycleview1

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter( val context: Context) : RecyclerView.Adapter<UserAdapter.UserViewHolder>(){

    private lateinit var mListUser: List<User>

    @SuppressLint("NotifyDataSetChanged")
    fun setData(list : List<User>){
        this.mListUser = list
        // cực kì quan trọng để thông báo về sự thay đổi của dữ liệu
        notifyDataSetChanged()
    }

    class UserViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val imgUser : ImageView
        val tvName : TextView

        init{
            imgUser = view.findViewById(R.id.img_user)
            tvName = view.findViewById(R.id.tv_name)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mListUser.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.tvName.text = mListUser[position].name
        holder.imgUser.setImageResource(mListUser[position].resouceImage)
    }
}