package ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.das_android.R
import data.dto.club.ClubListResponse
import data.dto.user.userList.UserListResponse

class ClubRecyclerViewAdapter(var data: MutableLiveData<ArrayList<ClubListResponse>>) :
    RecyclerView.Adapter<ClubRecyclerViewAdapter.MyViewHolder>(){
    inner class MyViewHolder constructor(parent : ViewGroup):RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.club_item_list,parent,false)
    ){
        var clubImage = itemView.findViewById<ImageView>(R.id.club_profile)
        var clubName = itemView.findViewById<TextView>(R.id.club_name)
        var countView = itemView.findViewById<TextView>(R.id.club_count_view)
        var clubStack = itemView.findViewById<TextView>(R.id.club_stack)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        data.value!!.get(position).let {
                item -> with(holder){
                    clubName.text = item.club_name
                    countView.text = item.like_count.toString()
                    clubStack.text = item.Club_category
            }
        }
    }

    override fun getItemCount(): Int {
        return data.value!!.size
    }

}