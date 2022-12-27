package ui.adapter

import android.app.Application
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.das_android.R
import data.dto.club.ClubListResponse
import ui.activity.auth.DetailActivity
import ui.fragment.ClubDetailFragment
import util.startIntent
import util.startIntentClearTop

class ClubRecyclerViewAdapter(var data: ArrayList<ClubListResponse>, val mContext1: Application) :
    RecyclerView.Adapter<ClubRecyclerViewAdapter.MyViewHolder>(){
    inner class MyViewHolder constructor(parent : ViewGroup):RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.club_item_list,parent,false)
    ){
        var clubName = itemView.findViewById<TextView>(R.id.club_name)
        var countView = itemView.findViewById<TextView>(R.id.club_count_view)
        var clubStack = itemView.findViewById<TextView>(R.id.club_stack)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.clubName.text = data.get(position).club_name
        holder.countView.text = data.get(position).like_count.toString()
        holder.clubStack.text = data.get(position).Club_category

        holder.itemView.setOnClickListener {
            startIntentClearTop(mContext1,DetailActivity::class.java)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

}