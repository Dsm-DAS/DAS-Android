package ui.fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.FragmentWriteClubBinding
import data.dto.club.ClubListResponse
import ui.adapter.ClubRecyclerViewAdapter
import viewmodel.RecyclerView.ClubRecyclerViewModel

class WriteClubFragment : BaseFragment<FragmentWriteClubBinding>(R.layout.fragment_write_club) {

    var data = MutableLiveData<ArrayList<ClubListResponse>>()
    lateinit var adapter: ClubRecyclerViewAdapter
    lateinit var viewModel: ClubRecyclerViewModel

    fun initView(){
        binding.apply {
            viewModel = ViewModelProviders.of(this@WriteClubFragment).get(ClubRecyclerViewModel::class.java)
            binding.recyclerViewWriteClub.layoutManager = LinearLayoutManager(activity)

            val dataObserver : Observer<ArrayList<ClubListResponse>> =
                Observer { livedata ->
                    data.value = livedata
                    var newAdapter = ClubRecyclerViewAdapter(data)
                    binding.recyclerViewWriteClub.adapter= newAdapter
                }
            viewModel.liveData.observe(this@WriteClubFragment,dataObserver)
        }
    }
}