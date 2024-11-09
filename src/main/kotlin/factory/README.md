# Factory Pattern

## Purpose:
The **Factory Pattern** is used to create objects without specifying the exact class of the object that will be created. It allows a class to defer instantiation to subclasses or helper classes, making it easier to add new types later without changing existing code.

## How It Works in Kotlin:
In Kotlin, the Factory Pattern can be implemented using a function or an interface with a factory method that decides which class to instantiate based on input.

## Why Use the Factory Pattern?
### Simplifies Object Creation: 
It centralizes the instantiation logic, so the client code doesn’t need to know details about the specific classes.
### Easily Extendable: 
Adding new types (e.g., adding a AppNotification) requires only modifying the factory, keeping client code unchanged.
### Promotes Loose Coupling: 
The client code is only dependent on the interface, not the concrete implementations.