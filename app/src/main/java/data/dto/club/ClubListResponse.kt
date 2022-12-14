package data.dto.club

import retrofit2.http.Url
import java.net.URL

data class ClubListResponse(
    val club_id : Int,
    val club_name : String,
    val club_image_url : String,
    val club_introduce : String,
    val club_type : String,
    Cluv_category : String,
    like_count : Int,
)