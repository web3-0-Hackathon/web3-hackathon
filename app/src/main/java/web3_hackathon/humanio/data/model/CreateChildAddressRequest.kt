package web3_hackathon.humanio.data.model

import com.google.gson.annotations.SerializedName

data class CreateChildAddressRequest(
    val name: String?,
    val offset: Int,
    val pin: String?,
    val recoveryPin: String? = null
)