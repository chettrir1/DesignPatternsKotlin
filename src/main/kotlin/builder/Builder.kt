package org.example.builder

private class UserProfile constructor(
    val name: String,
    val age: Int?,
    val email: String?,
    val phone: String?
) {
    data class Builder(
        private var name: String,
        private var age: Int? = null,
        private var email: String? = null,
        private var phone: String? = null,
    ) {
        fun age(age: Int) = apply { this.age = age }
        fun email(email: String) = apply { this.email = email }
        fun phone(phone: String) = apply { this.phone = phone }
        fun build() = UserProfile(name, age, email, phone)
    }
}

fun main() {
    val userProfile = UserProfile.Builder(name = "Raju")
        .age(29)
        .email("raju@example.com")
        .phone("(123) 123 1234")
        .build()

    println(userProfile)
}