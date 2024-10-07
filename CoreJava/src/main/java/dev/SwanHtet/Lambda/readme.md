# Java Lambda Expressions

## Overview

Java Lambda Expressions, a feature introduced in Java 8 that enables functional programming. Lambda expressions allow you to write more readable and concise code, especially when working with collections and functional interfaces.

This is like this in js
```javascript
(res, req) =>{
    //
}
```


## Features

- Simplified syntax for implementing functional interfaces
- Enables passing behavior as parameters
- Enhances code readability and maintainability

## Basic Syntax

A lambda expression consists of:
- **Parameters**: Input parameters for the expression
- **Arrow Operator**: `->` separates parameters from the body
- **Body**: The expression or block of code to be executed

### Example: Using Lambda Expressions

This example demonstrates how to use a lambda expression to sort a list of names.

```java
import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.sort((a, b) -> a.compareTo(b));
        names.forEach(name -> System.out.println(name));
    }
}
