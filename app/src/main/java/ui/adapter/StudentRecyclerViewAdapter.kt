package ui.adapter

import android.app.Application
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.das_android.R
import data.dto.user.userList.UserListData
import ui.activity.MenuProfileActivity
import util.startIntentClearTop

class StudentRecyclerViewAdapter (var data: ArrayList<UserListData>, val mContext2: Application) :
    RecyclerView.Adapter<StudentRecyclerViewAdapter.MyViewHolder>(){
    inner class MyViewHolder constructor(parent : ViewGroup):RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.student_item_list,parent,false)
    ){
        var name = itemView.findViewById<TextView>(R.id.student_name)
        var countView = itemView.findViewById<TextView>(R.id.count)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.text = data.get(position).name
        holder.countView.text = data.get(position).view_count.toString()

        holder.itemView.setOnClickListener {
            startIntentClearTop(mContext2, MenuProfileActivity::class.java)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

}