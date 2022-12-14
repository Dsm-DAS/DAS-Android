package data.dto.feed

import java.net.URL

data class RecruitmentListResponse(
    val profile_image_url : URL,
    val name : String,
    val content : String,
)
