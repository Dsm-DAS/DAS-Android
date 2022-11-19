package data.dto.user.register

data class registerRequest(
    val email: String,
    val password: String,
    val name: String,
    val grade: Integer,
    val class_num: Integer,
    val number: Integer,
)
