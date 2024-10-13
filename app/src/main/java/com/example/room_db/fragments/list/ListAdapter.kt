package com.example.room_db.fragments.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.room_db.Model.User
import com.example.room_db.R

class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private var userList = emptyList<User>()

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        // Bind the views here
        val idTextView: TextView = itemView.findViewById(R.id.id_txt)
        val TextView2: TextView = itemView.findViewById(R.id.textView2)
        val TextView3: TextView = itemView.findViewById(R.id.textView3)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_row, parent, false))
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = userList[position]
        holder.idTextView.text = currentItem.id.toString()
        holder.TextView2.text = currentItem.firstName
        holder.TextView3.text = currentItem.lastName
    }

    fun setData(user: List<User>) {
        this.userList = user
        notifyDataSetChanged()
    }
}
