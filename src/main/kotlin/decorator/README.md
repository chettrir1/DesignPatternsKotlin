# Decorator Pattern

## Purpose:
The **Decorator Pattern** is a structural design pattern that allows to dynamically add behaviour or responsibilities to an object without modifying its structure. It is used when we want to extend functionality to the class without creating subclass.

## How It Works in Kotlin:
#### 1. Defines common behaviour for eg. cost() and description()
#### 2. The base class for eg. PlainCoffee that implement the interface
#### 3. An abstract class (Decorator) that wraps the component and delegates call while adding extra functionality.
#### 4. Implementations that add specific behaviours

## Why Use the Builder Pattern?
### Flexibility:
Add behaviour to an object dynamically.
### Reusability:
Combine multiple decorators for flexible features.
### Open/Closed Principle:
Extend functionality without modifying the original class.