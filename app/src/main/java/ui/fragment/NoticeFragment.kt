package ui.fragment

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.FragmentNoticeBinding
import data.api.notice.NoticeRepository
import data.dto.notice.NoticeList
import ui.adapter.NoticeRecyclerviewAdapter
import viewModel.notice.NoticeViewModel
import viewModel.notice.NoticeViewModelFactory


class NoticeFragment : BaseFragment<FragmentNoticeBinding>(R.layout.fragment_notice) {

    private val noticeRepository: NoticeRepository by lazy {
        NoticeRepository()
    }



    private val noticeViewModel: NoticeViewModel by lazy {
        ViewModelProvider(
            this, NoticeViewModelFactory(noticeRepository)
        )[NoticeViewModel::class.java]
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        observeNoticeListResponse()

        binding.model = noticeViewModel
        noticeViewModel.noticeList()

        binding.rvNoticeList.visibility = View.VISIBLE
        val noticeList = arrayListOf(
            NoticeList(1, "앙기모찌","2022-12-26",10)
        )

        noticeList.addAll(noticeList)
    }


    private fun setNoticeRecyclerView(
        allNoticeList: ArrayList<NoticeList>

        ) {
        setRecyclerView(
            rv = binding.rvNoticeList,
            noticeList = allNoticeList
        )
    }


    private fun setRecyclerView(
        rv: RecyclerView,
        noticeList: ArrayList<NoticeList>,

    ) {
        rv.run {
            adapter = NoticeRecyclerviewAdapter(
                noticeList = noticeList,
                noticeViewModel = noticeViewModel
            )
            layoutManager = LinearLayoutManager(
                this@NoticeFragment.requireContext()
            )
        }
    }



    private fun observeNoticeListResponse() {
        noticeViewModel.noticeResponse.observe(
            viewLifecycleOwner
        ) {
            when (it.code()) {

                200 -> {

                }

                400 -> println("요청 형식을 식별할 수 없음")

                401 -> println("토큰 만료 or 인증 실패")

                403 -> {
                    binding.rvNoticeList.visibility = View.VISIBLE
                    println("엄....")
                }
            }
        }
    }
}