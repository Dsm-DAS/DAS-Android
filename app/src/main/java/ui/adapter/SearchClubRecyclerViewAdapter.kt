package ui.adapter

import android.app.Application
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.das_android.R
import data.dto.club.ClubListResponse
import ui.activity.auth.DetailActivity
import util.startIntentClearTop

class SearchClubRecyclerViewAdapter(var data: ArrayList<ClubListResponse>, val mContext1: Application) :
    RecyclerView.Adapter<SearchClubRecyclerViewAdapter.MyViewHolder>(){
    inner class MyViewHolder constructor(parent : ViewGroup):RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.club_item_list,parent,false)
    ){
        var clubName = itemView.findViewById<TextView>(R.id.club_name)
        var img = itemView.findViewById<ImageView>(R.id.club_profile)
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
        holder.img.setImageResource(data.get(position).club_image_url)

        holder.itemView.setOnClickListener {
            startIntentClearTop(mContext1,DetailActivity::class.java)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

}