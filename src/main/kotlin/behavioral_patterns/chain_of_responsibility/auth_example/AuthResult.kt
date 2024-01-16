package behavioral_patterns.chain_of_responsibility.auth_example

sealed class AuthResult {
    data object Success : AuthResult()
    data class Failure(val message : String) : AuthResult()
}