# Builder Pattern

## Purpose:
The **Builder Pattern** is a creational design pattern used to construct complex objects with multiple optional parameters.This patterns seperates the construction of an object from the representation, allowing step-by step creation of objects while keeping them immutable.

## How It Works in Kotlin:
In Kotlin, the Builder Pattern can be implemented using a separate builder class that has a method for setting each property of the target class. Once all the necessary properties are set, build method is called to create the target object.

## Why Use the Builder Pattern?
### Simplifies Object Creation:
It helps creating objects with multiple optional properties without requiring numerous overloaded constructors. 
### Readable and Maintainable:
It makes code more readable, with chainable API for setting properties. Also adding and modifying properties is easy.
### Promotes Immutability:
Object constructed can be made immutable, as all the properties are set during object creation and cannot be changed later.