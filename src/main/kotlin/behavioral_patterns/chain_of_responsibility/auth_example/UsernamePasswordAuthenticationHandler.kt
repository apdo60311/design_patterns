package behavioral_patterns.chain_of_responsibility.auth_example

class UsernamePasswordAuthenticationHandler(private val dbRepository : Repository, private val nextHandler : AuthenticationHandler) :
    AuthenticationHandler {
    override fun authenticate(request: Request): AuthResult {
        try {
            val user : User = dbRepository.getUserByUsername(request.username);
            if (request.username == user.username && request.password == user.password) {
                println("Username-Password Authentication Done..")
                nextHandler.authenticate(request);
            } else {
                println("Not Authenticated")
            }
            return AuthResult.Success
        } catch (exception : Exception) {
            return AuthResult.Failure(exception.message.toString())
        }
    }

}