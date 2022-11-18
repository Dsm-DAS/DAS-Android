package data.dto.user.register

import com.google.gson.annotations.SerializedName

data class EmailcodeRequest(
    @SerializedName("email") val email: String
)
