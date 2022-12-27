package ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.das_android.R
import data.dto.user.userList.UserListResponse

class HomeStudentRecyclerViewAdapter(private val itemList: ArrayList<UserListResponse>) : RecyclerView.Adapter<HomeStudentRecyclerViewAdapter.CustomViewHolder>()
{
    inner class CustomViewHolder constructor(parent: ViewGroup): RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.student_item_list, parent, false)
    ) {
        var name = itemView.findViewById<TextView>(R.id.student_count_view)
        var count = itemView.findViewById<TextView>(R.id.user_profile)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(parent)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.name.text = itemList[position].name
        holder.count.text = itemList[position].view_count.toString()
        }

    override fun getItemCount(): Int {
        return itemList.size
    }
}
