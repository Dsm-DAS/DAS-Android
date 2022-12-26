package data.api.user.userList

import data.dto.user.userList.UserListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface UserListApi {

    //학생리스트 전체 조회
    @GET("/user")
    suspend fun userList(
        @Header("Authorization") ACCESS_TOKE: String,
    ): Response<UserListResponse>
}