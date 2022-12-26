package data.api.notice

import data.dto.notice.NoticeListResponse
import data.noticeApiProvider
import retrofit2.Response
import util.ACCESS_TOKEN

class NoticeRepository {

    suspend fun noticeList(): Response<NoticeListResponse> =
        noticeApiProvider.noticeList(ACCESS_TOKEN)

}