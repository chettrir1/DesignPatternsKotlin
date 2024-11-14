package org.example.strategy

interface PaymentStrategy {
    fun pay(amount: Double)
}

class CreditDebitPayment : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Payment of $amount through Credit or debit Card!")
    }
}

class PayPalPayment : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Payment of $amount through Paypal!")
    }
}

class BitcoinPayment : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Payment of $amount through Bitcoin!")
    }
}

class ShoppingCart(private var paymentStrategy: PaymentStrategy) {

    fun setPaymentStrategy(paymentStrategy: PaymentStrategy) {
        this.paymentStrategy = paymentStrategy
    }

    fun checkout(amount: Double) {
        paymentStrategy.pay(amount)
    }
}

fun main() {
    val shoppingCart = ShoppingCart(CreditDebitPayment())
    shoppingCart.checkout(100.0)

    shoppingCart.setPaymentStrategy(PayPalPayment())
    shoppingCart.checkout(200.0)

    shoppingCart.setPaymentStrategy(BitcoinPayment())
    shoppingCart.checkout(250.0)

}

