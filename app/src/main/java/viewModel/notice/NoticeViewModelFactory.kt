package viewModel.notice

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import data.api.notice.NoticeRepository

@Suppress("UNCHECKED_CAST")
class NoticeViewModelFactory(private val noticeRepository: NoticeRepository):
    ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NoticeViewModel(noticeRepository) as T
    }
}