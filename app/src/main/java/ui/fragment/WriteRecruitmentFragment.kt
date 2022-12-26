package ui.fragment

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.FragmentWriteRecruitmentBinding
import data.dto.feed.RecruitmentListResponse
import ui.adapter.RecruitmentRecyclerViewAdapter
import viewModel.RecyclerView.RecruitmentRecyclerViewModel

class WriteRecruitmentFragment : BaseFragment<FragmentWriteRecruitmentBinding>(R.layout.fragment_write_recruitment) {

    var data = MutableLiveData<ArrayList<RecruitmentListResponse>>()
    lateinit var adapter: RecruitmentRecyclerViewAdapter
    lateinit var viewModel: RecruitmentRecyclerViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    fun initView() {
        binding = activity?.let { DataBindingUtil.setContentView(it,R.layout.fragment_write_recruitment) }!!
        viewModel = ViewModelProviders.of(this)[RecruitmentRecyclerViewModel::class.java]

        binding.rvRecruitment.layoutManager = LinearLayoutManager(activity)

        val dataObserver : Observer<ArrayList<RecruitmentListResponse>> =
            Observer { livedata ->
                data.value = livedata
                val newAdapter = RecruitmentRecyclerViewAdapter(data)
                binding.rvRecruitment.adapter= newAdapter
            }
        activity?.let { viewModel.liveData.observe(it,dataObserver) }
    }
}
