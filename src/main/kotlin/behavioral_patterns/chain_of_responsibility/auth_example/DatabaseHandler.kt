package behavioral_patterns.chain_of_responsibility.auth_example


interface Repository {
    fun getUserByUsername(user: String) : User
}

class DatabaseRepository : Repository {

    private val users: MutableMap<String , User> = mutableMapOf(
        Pair("user1" , User("user1", "1234", UserRole.LoggedIn)),
        Pair("user2" , User("user2", "4567", UserRole.LoggedIn)),
        Pair("user3" , User("user3", "43442", UserRole.Admin)),
        Pair("user4" , User("user4", "142331", UserRole.Admin)),
        Pair("user5" , User("user5", "5782", UserRole.LoggedIn)),
    );

    override fun getUserByUsername(user : String) : User {
        if (users.contains(user)) {
            return users[user]!!;
        } else {
            throw Exception("User not found")
        }
    }
}