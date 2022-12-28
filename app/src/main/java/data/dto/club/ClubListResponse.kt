package data.dto.club

data class ClubListResponse(
    val club_name: String,
    val club_image_url: Int,
    val club_introduce: String,
    val club_type: String,
    val Club_category: String,
    val like_count: Int,
)