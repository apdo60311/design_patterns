package behavioral_patterns.chain_of_responsibility.auth_example

class Request (val username:String, val password:String, val role: UserRole, val otp : Boolean, val biometric : Boolean) {}

