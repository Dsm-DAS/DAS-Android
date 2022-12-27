package ui.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.FragmentHomeBinding
import ui.adapter.HomeStudentRecyclerViewAdapter
import java.nio.file.Files.find


class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {



}





//
//    var data = MutableLiveData<ArrayList<UserListResponse>>()
//    lateinit var adapter: StudentRecyclerViewAdapter
//    lateinit var viewModel: StudentRecyclerViewModel
//
//    private val userListRepository : UserListRepository by lazy {
//        UserListRepository()
//    }
//
//    private val userViewModel : StudentRecyclerViewModel by lazy {
//        ViewModelProvider(this, StudentViewModelFactory(userListRepository))[StudentRecyclerViewModel::class.java]
//    }
//
//    fun initView() {
//        recyclerView()
//    }
//
//    fun observeEvent() {
//        userViewModel.userListResponse.observe(
//            this
//        ){
//            when(it.code()){
//                200 -> {
//                    recyclerView()
//            }
//            }
//        }
//    }
//
//    @SuppressLint("UseRequireInsteadOfGet")
//    private fun recyclerView() {
//        binding = DataBindingUtil.setContentView(activity!!,R.layout.fragment_home)
//        viewModel = ViewModelProviders.of(this).get(StudentRecyclerViewModel::class.java)
//
//        binding.recyclerViewHomeStudent.layoutManager = LinearLayoutManager(activity)
//
//        val dataObserver : Observer<ArrayList<UserListResponse>> =
//            Observer { livedata ->
//                data.value = livedata
//                var newAdapter = StudentRecyclerViewAdapter(data)
//                binding.recyclerViewHomeStudent.adapter= newAdapter
//            }
//        viewModel.liveData.observe(this,dataObserver)
//    }
//}

