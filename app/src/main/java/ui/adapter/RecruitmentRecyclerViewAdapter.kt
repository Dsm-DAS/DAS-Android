package ui.adapter

import android.app.Application
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.das_android.R
import data.dto.feed.RecruitmentListResponse
import ui.activity.auth.RecruitmentDetailActivity
import util.startIntentClearTop

class RecruitmentRecyclerViewAdapter(var data: ArrayList<RecruitmentListResponse>,val mContext : Application) :
    RecyclerView.Adapter<RecruitmentRecyclerViewAdapter.MyViewHolder>(){
    inner class MyViewHolder constructor(parent : ViewGroup):RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.recruitment_item_list,parent,false)
    ){
        var name = itemView.findViewById<TextView>(R.id.recruitment_name)
        var content = itemView.findViewById<TextView>(R.id.recruitment_content)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.text = data.get(position).name
        holder.content.text = data.get(position).content
        holder.itemView.setOnClickListener{
            startIntentClearTop(mContext,RecruitmentDetailActivity::class.java)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

}