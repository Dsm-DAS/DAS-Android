package data.dto.user.userList

import android.media.Image
import retrofit2.http.Url

data class UserListResponse (
    val user_id : Int,
    val name : String,
    val profile_image_url : String,
    val view_count : Int,
    val grade : String,
    val class_num : String,
    val introduce : String,
    )