package behavioral_patterns.chain_of_responsibility.auth_example

interface AuthenticationHandler {
    fun authenticate(request: Request) : AuthResult
}

