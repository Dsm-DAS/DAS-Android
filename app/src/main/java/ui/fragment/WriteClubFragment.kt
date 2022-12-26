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
import com.example.das_android.databinding.FragmentWriteClubBinding
import data.dto.club.ClubListResponse
import ui.adapter.ClubRecyclerViewAdapter
import viewModel.RecyclerView.ClubRecyclerViewModel

class WriteClubFragment : BaseFragment<FragmentWriteClubBinding>(R.layout.fragment_write_club) {

    var data = MutableLiveData<ArrayList<ClubListResponse>>()
    lateinit var viewModel: ClubRecyclerViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    fun initView() {
        binding = activity?.let { DataBindingUtil.setContentView(it,R.layout.fragment_write_club) }!!
        viewModel = ViewModelProviders.of(this)[ClubRecyclerViewModel::class.java]

        binding.rvClub.layoutManager = LinearLayoutManager(activity)

        val dataObserver : Observer<ArrayList<ClubListResponse>> =
            Observer { livedata ->
                data.value = livedata
                val newAdapter = ClubRecyclerViewAdapter(data)
                binding.rvClub.adapter= newAdapter
            }
        activity?.let { viewModel.liveData.observe(it,dataObserver) }
    }
}