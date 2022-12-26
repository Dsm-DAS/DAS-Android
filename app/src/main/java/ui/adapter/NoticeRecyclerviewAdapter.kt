package ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.das_android.R
import com.example.das_android.databinding.ListNoticeBinding
import data.dto.notice.NoticeList
import viewModel.notice.NoticeViewModel


class NoticeRecyclerviewAdapter(
    private val noticeList: ArrayList<NoticeList>,
    private val noticeViewModel: NoticeViewModel,
) : RecyclerView.Adapter<NoticeRecyclerviewAdapter.NoticeListViewHolder>() {


    class NoticeListViewHolder(val binding: ListNoticeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(
            noticeList: NoticeList,
        ) {
            binding.model = noticeList
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int): NoticeListViewHolder =
        NoticeListViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.list_notice,
                parent,
                true)
        )


    override fun onBindViewHolder(
        holder: NoticeListViewHolder,
        position: Int) {
        holder.bind(
            noticeList = noticeList[position])
    }

    override fun getItemCount(): Int{
        return noticeList.size
    }
}

