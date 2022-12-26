package data.api.notice

import data.dto.notice.NoticeListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface NoticeApi {

    //공지 리스트 조회
    @GET("/notice")
    suspend fun noticeList(
        @Header("Authorization") ACCESS_TOKEN: String,
    ): Response<NoticeListResponse>



}