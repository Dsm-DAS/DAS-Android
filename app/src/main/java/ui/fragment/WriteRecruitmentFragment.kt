package ui.fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.FragmentWriteRecruitmentBinding
import data.dto.feed.RecruitmentListResponse
import ui.adapter.ClubRecyclerViewAdapter
import ui.adapter.RecruitmentRecyclerViewAdapter
import viewmodel.RecyclerView.RecruitmentRecyclerViewModel

class WriteRecruitmentFragment : BaseFragment<FragmentWriteRecruitmentBinding>(R.layout.fragment_write_recruitment) {

    var data = MutableLiveData<ArrayList<RecruitmentListResponse>>()
    lateinit var adapter: RecruitmentRecyclerViewAdapter
    lateinit var viewModel: RecruitmentRecyclerViewModel

    fun initView(){
        binding.apply {
            viewModel = ViewModelProviders.of(this@WriteRecruitmentFragment).get(RecruitmentRecyclerViewModel::class.java)
            binding.recyclerViewWriteRecruitment.layoutManager = LinearLayoutManager(activity)

            val dataObserver : Observer<ArrayList<RecruitmentListResponse>> =
                Observer { livedata ->
                    data.value = livedata
                    var newAdapter = RecruitmentRecyclerViewAdapter(data)
                    binding.recyclerViewWriteRecruitment.adapter= newAdapter
                }
            viewModel.liveData.observe(this@WriteRecruitmentFragment,dataObserver)
        }
    }
}
