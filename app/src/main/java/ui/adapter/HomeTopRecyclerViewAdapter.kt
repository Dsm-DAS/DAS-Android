package ui.adapter

import android.annotation.SuppressLint
import android.app.Application
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.das_android.R
import data.dto.user.home

class HomeTopRecyclerViewAdapter(var data: ArrayList<Int>, val mContext1: Application) :
    RecyclerView.Adapter<HomeTopRecyclerViewAdapter.MyViewHolder>(){

    inner class MyViewHolder constructor(parent : ViewGroup):RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.list_home_top,parent,false)
    ){

        var img = itemView.findViewById<ImageView>(R.id.list_top)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) =
        holder.img.setImageResource(data.get(position))

    override fun getItemCount(): Int {
        return data.size
    }

}