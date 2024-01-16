package behavioral_patterns.chain_of_responsibility.auth_example

class BiometricAuthHandler(private val nextHandler: AuthenticationHandler? = null) : AuthenticationHandler {
    override fun authenticate(request: Request): AuthResult {
        if (request.biometric) {
            // simulate biometric auth logic
            println("Biometric authentication successful")
            return AuthResult.Success
        } else {
            return nextHandler?.authenticate(request) ?: AuthResult.Failure("Biometric authentication failed")
        }
    }
}