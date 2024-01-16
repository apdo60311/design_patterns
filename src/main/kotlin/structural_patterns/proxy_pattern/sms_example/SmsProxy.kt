package structural_patterns.proxy_pattern.sms_example

class SmsProxy : MessageService {
    private val users : MutableMap<String , Int> = mutableMapOf();
    private val maxMessagesCount : Int by lazy { 10 }

    override fun sendMessage(message: Message) {
        val sender : String = message.from
        if (!users.containsKey(sender)) {
            users[sender] = 1
            println("Message sent.. Only ${maxMessagesCount - 1} messages remaining")
        } else if(users[sender]!! < maxMessagesCount) {
            users[sender] = users[sender]!! + 1
            println("Message sent.. Only ${maxMessagesCount - users[sender]!!} messages remaining")
        }else {
            println("Message not sent!!")
        }
    }
}