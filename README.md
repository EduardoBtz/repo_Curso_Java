# Course: Introduction to Java Standard Edition

This repository includes Java files implemented while learning the fundamentals of the Java programming language.

# Course Content
[Basic concepts and information](#basic-concepts-and-information)\
[Variables](#variables)\
[Conditional operations](#conditional-operations)\
[Functions](#functions)\
[Loops](#loops)

## Basic concepts and information 

- Java versions (SE and EE)
- Program execution cycle
- Installation of Intellij IDE
- Java Shell

```java
System.out.println("Hello World!");
```

## Variables 

- Variable declaration
- Data types
- Variable Casting
- Operators (Assignation, Increment, Decrement)
- Arithmetic operations
- Generating .JAR files

```java
double a = (int) 25.5;
double b = 5.0;
double c = a/b;
```

## Conditional operations
- If statments
- Switch statement

```java
// If statement
if (2 < 5) {
    // Executes if true
}else {
    // Executes if false
}

// Switch statement
switch(a) {
    case 1:
        // Do if a == 1
        break;
    case 2:
        // Do if a == 2
        break;
    default:
        // Do if none of the above
}
```

# Functions 
- Function syntax
- Javadocs
- Tags

```java
/**
 * This function converts money to specified currency. Works with MXN and USD.
 * @param quantity Quantity of money.
 * @param currency Type of currency (MXN/USD).
 * @return Returns Converted Quantity.
 */
public static double convertCurrency(double quantity, String currency) {
    switch (currency) {
        case "MXN":
            quantity = quantity * 0.050;
            break;
        case "USD":
            quantity = quantity * 20;
    }
    return quantity;
}
```

# Loops
- Do While
- While
- For
- Looping through Arrays and Matrixes

```java
// Do While Loop
do {
  // Executes first 
  // Then checks condition
}while(a<b);

// While Loop
while(i<10) {
  // Executes while i <10
  i++;
}

// For Loop
for(int i=0; i<10; i++) {
    for(int j=0; j<10; j++) {
        mat[i][j] = 0;
     }
}   
```


### Elaborated by
[Eduardo Benitez](https://github.com/EduardoBtz)
