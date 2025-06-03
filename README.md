
---

# Java Wrapper Classes Example — Autoboxing and Unboxing

## Description

This project demonstrates Java **wrapper classes** and the concepts of **autoboxing** and **unboxing**. It shows how primitive types can be automatically converted to their corresponding wrapper objects and vice versa.

## Features

* Creates an `Integer` object using `Integer.valueOf()`.
* Demonstrates autoboxing: automatic conversion from primitive `int` to `Integer`.
* Demonstrates unboxing: automatic conversion from `Integer` to primitive `int`.
* Prints the wrapped integer value.

## Code Structure

* `wrapClass` class: Contains the `main` method showcasing wrapper class usage.

## How to Run

1. Compile the class:

   ```bash
   javac Concepts/Wrapperclasses/wrapClass.java
   ```

2. Run the program:

   ```bash
   java Concepts.Wrapperclasses.wrapClass
   ```

## Sample Output

```
7
```

## Explanation

* `Integer first = Integer.valueOf(7);` explicitly creates an `Integer` object.
* `Integer second = 4;` shows autoboxing, converting primitive `4` to `Integer`.
* `int a = first;` demonstrates unboxing back to primitive `int`.
* The `System.out.println(first);` prints the value `7`.

## Requirements

* Java JDK 8 or above
* Understanding of primitive and wrapper types in Java

