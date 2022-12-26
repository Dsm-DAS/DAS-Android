package ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.das_android.R
import data.dto.feed.RecruitmentListResponse
import data.dto.user.userList.UserListResponse

class RecruitmentRecyclerViewAdapter(var data: MutableLiveData<ArrayList<RecruitmentListResponse>>) :
    RecyclerView.Adapter<RecruitmentRecyclerViewAdapter.MyViewHolder>(){
    inner class MyViewHolder constructor(parent : ViewGroup):RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.recruitment_item_list,parent,false)
    ){
        var name = itemView.findViewById<TextView>(R.id.recruitment_name)
        var content = itemView.findViewById<TextView>(R.id.recruitment_content)
        var profile = itemView.findViewById<ImageView>(R.id.recruitment_profile)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        data.value!!.get(position).let {
                item -> with(holder){
                    name.text = item.name
                    content.text = item.content
            }
        }
    }

    override fun getItemCount(): Int {
        return data.value!!.size
    }

}