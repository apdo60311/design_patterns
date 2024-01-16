package behavioral_patterns.chain_of_responsibility.auth_example

class OTPAuthHandler(private val nextHandler: AuthenticationHandler? = null) : AuthenticationHandler {
    override fun authenticate(request: Request): AuthResult {
        if (request.otp) {
            // simulate otp auth logic
            println("Two-factor authentication successful (OTP)")
            return AuthResult.Success
        } else {
            return nextHandler?.authenticate(request) ?: AuthResult.Failure("Two-factor authentication failed (OTP)")
        }
    }
}