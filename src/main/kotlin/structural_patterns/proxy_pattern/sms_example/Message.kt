package structural_patterns.proxy_pattern.sms_example

class Message(var from: String, var to: String, var date: String) {


    fun getContent(): String {
        return """
            From : $from
            To   : $to
            Date : $date
        """.trimIndent()
    }
}
