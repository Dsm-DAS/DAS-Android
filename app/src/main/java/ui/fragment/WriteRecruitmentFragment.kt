package ui.fragment

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
<<<<<<< Updated upstream
=======
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
>>>>>>> Stashed changes
import androidx.recyclerview.widget.LinearLayoutManager
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.FragmentWriteRecruitmentBinding
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
import data.dto.feed.RecruitmentListResponse
import ui.adapter.RecruitmentRecyclerViewAdapter
import viewModel.RecyclerView.RecruitmentRecyclerViewModel

class WriteRecruitmentFragment : BaseFragment<FragmentWriteRecruitmentBinding>(R.layout.fragment_write_recruitment) {

<<<<<<< Updated upstream
    var data = arrayListOf<RecruitmentListResponse>(

        RecruitmentListResponse("","프론트 모집합니다.","코도모 프론트 모집합니다.")
    )

=======
    /*
    var data = MutableLiveData<ArrayList<RecruitmentListResponse>>()
>>>>>>> Stashed changes
    lateinit var adapter: RecruitmentRecyclerViewAdapter
    lateinit var viewModel: RecruitmentRecyclerViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
<<<<<<< Updated upstream

    fun initView() {
        binding.rvRecruitment.layoutManager = LinearLayoutManager(activity,LinearLayoutManager.VERTICAL,false)
        binding.rvRecruitment.setHasFixedSize(true)
        binding.rvRecruitment.adapter = RecruitmentRecyclerViewAdapter(data)
=======
    fun initView() {
        binding = activity?.let {
            DataBindingUtil.setContentView(
                it,
                R.layout.fragment_write_recruitment
            )
        }!!
        viewModel = ViewModelProvider(this)[RecruitmentRecyclerViewModel::class.java]

        binding.rvRecruitment.layoutManager = LinearLayoutManager(activity)

        val dataObserver: Observer<ArrayList<RecruitmentListResponse>> =
            Observer { livedata ->
                data.value = livedata
                val newAdapter = RecruitmentRecyclerViewAdapter(data)
                binding.rvRecruitment.adapter = newAdapter
            }
        activity?.let { viewModel.liveData.observe(it, dataObserver) }
>>>>>>> Stashed changes
    }
*/
}
