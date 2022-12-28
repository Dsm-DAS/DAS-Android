package ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.FragmentHomeBinding
import data.dto.club.ClubListResponse
import data.dto.user.userList.UserListData
import ui.adapter.HomeClubRecyclerViewAdapter
import ui.adapter.HomeStudentRecyclerViewAdapter
import ui.adapter.HomeTopRecyclerViewAdapter
import util.startIntentClearTop


class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    var topData = arrayListOf<Int>(
        (R.drawable.img_50),
        (R.drawable.img_51),
        (R.drawable.img_40),
        (R.drawable.img_47),
        (R.drawable.img_49)
    )

    var studentData = arrayListOf<UserListData>(
        UserListData("김연우", R.drawable.img_das_logo, "39 조회"),
        UserListData("김은오", R.drawable.img_das_logo, "10 조회"),
        UserListData("박주영", R.drawable.img_das_logo, "15 조회"),
        UserListData("김철우", R.drawable.img_das_logo, "18조회"),
        UserListData("정지관", R.drawable.img_das_logo, "31 조회"),
        UserListData("강지인", R.drawable.img_das_logo, "19 조회"),
        UserListData("양운석", R.drawable.img_das_logo, "28 조회")
    )



    var data = arrayListOf<ClubListResponse>(
        ClubListResponse( "Kodomo", R.drawable.img_40, "#프론트엔드 #백엔드 #iOS #안드로이드", "전공동아리",
            "#WEB  #APP",
            99
        ),
            ClubListResponse("정",R.drawable.img_50,"#프론트엔드 #백엔드", "전공동아리","#WEB", 76),
            ClubListResponse(
                "DMS", R.drawable.img_49,"#프론트엔드 #백엔드 #iOS #안드로이드", "전공동아리", "#WEB  #APP", 47),

            ClubListResponse( "GRAM", R.drawable.img_47, "#프론트엔드 #백엔드", "전공동아리", "#WEB", 10),
        ClubListResponse("MoDeep", R.drawable.img_51, "", "#AI", "#AI",30)
        )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initTop()
        initStudent()

    }

    private fun initStudent(){
        binding.rvStudent.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvStudent.setHasFixedSize(true)
        binding.rvStudent.adapter = HomeStudentRecyclerViewAdapter(studentData,requireActivity().application)
    }

    private fun initTop(){
        binding.rvClub.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        binding.rvClub.setHasFixedSize(true)
        binding.rvClub.adapter = HomeTopRecyclerViewAdapter(topData,requireActivity().application)
    }


    private fun initView(){
        binding.recyclerView.layoutManager = LinearLayoutManager(activity,
            LinearLayoutManager.HORIZONTAL,false)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = HomeClubRecyclerViewAdapter(data,requireActivity().application)

    }

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

