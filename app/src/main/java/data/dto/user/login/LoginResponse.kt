package data.dto.user.login

data class LoginResponse(
    val access_token: String,
    val refresh_token: String,
    val authority: String,
    val expired_at: String
)
