package data.dto.user.register



data class RegisterRequest(
    val email: String,
    val password: String,
    val name: String,
    val grade: Int,
    val class_num: Int,
    val number: Int,
    val sex: String
)
