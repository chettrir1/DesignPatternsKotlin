package org.example.observer

interface Subscriber {
    fun update(message: String)
}

class NewsPublisher {
    private val subscribers = mutableListOf<Subscriber>()

    fun subscribe(subscriber: Subscriber) {
        subscribers.add(subscriber)
    }

    fun unSubscribe(subscriber: Subscriber) {
        subscribers.remove(subscriber)
    }

    fun notifySubscribers(message: String) {
        for (subscriber in subscribers) {
            subscriber.update(message)
        }
    }
}

class EmailSubscriber : Subscriber {

    override fun update(message: String) {
        println("Email Subscriber: $message")
    }

}

class SmsSubscriber : Subscriber {
    override fun update(message: String) {
        println("SMS Subscriber: $message")
    }
}

fun main() {
    val publisher = NewsPublisher()

    val emailSubscriber = EmailSubscriber()
    val smsSubscriber = SmsSubscriber()

    publisher.subscribe(emailSubscriber)
    publisher.subscribe(smsSubscriber)

    publisher.notifySubscribers("Version Released!")
}