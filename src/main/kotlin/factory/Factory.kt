package org.example.factory

interface Notification {
    fun send(message: String)
}

class EmailNotification : Notification {
    override fun send(message: String) {
        println("Sending Email: $message")
    }
}

class SmsNotification : Notification {
    override fun send(message: String) {
        println("Sending SMS: $message")
    }
}

class PushNotification : Notification {
    override fun send(message: String) {
        println("Sending Push Notification: $message")
    }
}

object NotificationFactory {
    fun createNotification(type: String): Notification {
        return when (type) {
            "Email" -> EmailNotification()
            "SMS" -> SmsNotification()
            "Push" -> PushNotification()
            else -> throw IllegalArgumentException("No Notification Type")
        }
    }
}

fun main() {
    val notificationType = "Push"
    val notification = NotificationFactory.createNotification(notificationType)
    notification.send("Welcome!")

}