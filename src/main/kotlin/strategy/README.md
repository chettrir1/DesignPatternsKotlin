# Strategy Pattern

## Purpose
The **Strategy Pattern** is behavioral design pattern that defines family of algorithms, allowing the algorithm to be selected in the runtime. It enables a class to choose a specific behaviour from a set of interchangeable algorithms without altering the code.

## How It Works in Kotlin:

####     1. Defining common interface for all the algorithms.
####     2. Implementing the algorithm in different concrete class.
####     3. Using the strategy interface and allowing dynamic switching of the algorithms.

## Why Use Strategy Pattern?
### 1. Flexibility
Can change behaviour of the class dynamically at runtime without modifying class.
### 2. Maintainability
New Strategies can be added without changing the existing code.
### 3. Loose Coupling
Context of class is decoupled from the concrete implementation of algorithm, allowing for more flexible and reusable code.


