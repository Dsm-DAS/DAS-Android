package viewModel.notice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import data.api.notice.NoticeRepository
import data.dto.notice.NoticeList
import data.dto.notice.NoticeListResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

class NoticeViewModel(
    private val noticeRepository: NoticeRepository
): ViewModel() {

    private val _noticeResponse: MutableLiveData<Response<NoticeListResponse>> by lazy {
        MutableLiveData()
    }

    val noticeResponse: LiveData<Response<NoticeListResponse>> by lazy {
        _noticeResponse
    }


    fun noticeList() {
        viewModelScope.launch(Dispatchers.IO) {
            _noticeResponse.postValue(noticeRepository.noticeList())
        }
    }



}