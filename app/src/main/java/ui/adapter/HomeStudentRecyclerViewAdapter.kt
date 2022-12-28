package ui.adapter

import android.app.Application
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.das_android.R
import data.dto.user.userList.UserListData
import ui.activity.MenuProfileActivity
import util.startIntentClearTop

class HomeStudentRecyclerViewAdapter(
    private val itemList: ArrayList<UserListData>, val mContext: Application
) : RecyclerView.Adapter<HomeStudentRecyclerViewAdapter.CustomViewHolder>()
{
    inner class CustomViewHolder constructor(parent: ViewGroup): RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.student_item_list, parent, false)
    ) {
        var name = itemView.findViewById<TextView>(R.id.student_name)
        var img = itemView.findViewById<ImageView>(R.id.user_profile)
        var count = itemView.findViewById<TextView>(R.id.count)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(parent)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.name.text = itemList[position].name
        holder.img.setImageResource(itemList.get(position).profile_image_url)
        holder.count.text = itemList[position].view_count


        holder.itemView.setOnClickListener {
            startIntentClearTop(mContext, MenuProfileActivity::class.java)
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}
