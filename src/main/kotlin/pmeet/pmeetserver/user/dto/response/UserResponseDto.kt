package pmeet.pmeetserver.user.dto.response

import pmeet.pmeetserver.user.domain.User

data class UserResponseDto(
  val id: String,
  val provider: String?,
  val email: String,
  val name: String,
  val nickname: String,
  val isEmployed: Boolean,
  val profileImageUrl: String?
) {
  companion object {
    fun from(user: User): UserResponseDto {
      return UserResponseDto(
        id = user.id!!,
        provider = user.provider,
        email = user.email,
        name = user.name,
        nickname = user.nickname,
        isEmployed = user.isEmployed,
        profileImageUrl = user.profileImageUrl
      )
    }
  }
}
