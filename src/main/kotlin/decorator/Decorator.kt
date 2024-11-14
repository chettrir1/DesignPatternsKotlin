package org.example.decorator

interface Coffee {
    fun cost(): Double
    fun description(): String
}

//concrete class
class PlainCoffee : Coffee {
    override fun cost(): Double = 5.0

    override fun description(): String = "Simple Coffee"
}

//abstract decorator
abstract class CoffeeDecorator(private val coffee: Coffee) : Coffee {
    override fun cost(): Double = coffee.cost()

    override fun description(): String = coffee.description()
}

class MilkDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost(): Double = super.cost() + 1.5
    override fun description(): String = super.description() + ", Milk"
}

class SugarDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost(): Double = super.cost() + 0.5
    override fun description(): String = super.description() + ", Sugar"
}

fun main() {
    var coffee: Coffee = PlainCoffee()

    coffee = MilkDecorator(coffee)
    coffee = SugarDecorator(coffee)
    println("${coffee.description()} costs total of ${coffee.cost()}")
}
