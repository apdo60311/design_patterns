package structural_patterns.proxy_pattern.sms_example

class SmsService : MessageService {
    override fun sendMessage(message: Message) {
        println("Message sent")
    }
}