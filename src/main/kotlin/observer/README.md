# Observer Pattern

## Purpose
The **Observer Pattern** is behavioral design pattern that allows an object to maintain a list of dependencies (observers) that it notifies whenever there is change in its state. It is mainly used when multiple part of system needs to be updated in response to data changes. 

## How It Works in Kotlin:
In Koltin, the observer pattern is implemented by creating:
####     1. An interface for the observers, defining the method to receive updates.
####     2. A subject class that maintains a list of observers and notifies them of changes.
####     3. Concrete observer classes that implement the observer interface to define specific update behaviour.

## Why Use Observer Pattern?
### 1. Real Time Update
Observers are notified of changes immediately, allowing real-time data updates and dynamic UI responses.
### 2. Loose Coupling
The subject class only maintains list of observers but is not dependent on their specific implementations, which promotes loose coupling.
### 3. Flexibility
Easily add or remove observers to customize the behaviour in different parts of application without modifying the subject.

