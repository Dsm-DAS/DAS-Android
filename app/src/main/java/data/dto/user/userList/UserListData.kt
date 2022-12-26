package data.dto.user.userList

data class UserListResponse (
    val name : String,
    val profile_image_url : String,
    val view_count : Int,
    val grade : String,
    val class_num : String,
    val introduce : String,
)