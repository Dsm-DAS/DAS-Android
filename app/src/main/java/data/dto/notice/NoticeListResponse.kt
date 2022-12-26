package data.dto.notice

data class NoticeListResponse(

    val notice: ArrayList<NoticeList>
)

data class NoticeList(
    val notice_id: Int,
    val title: String,
    var created_at: String,
    val view: Int
)