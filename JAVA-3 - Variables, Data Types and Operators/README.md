
<img align="right" width="150" height="150" src="https://media-exp1.licdn.com/dms/image/C4E0BAQF7BYCCZt5epw/company-logo_200_200/0?e=2159024400&v=beta&t=qUAFP9bUgBEEXGVQYpUXW1J_OiP8e0r4rFBpqp8OrxA">

# JAVA-3 Variables, Data Types and Operators

 <br/>
 <br/>


 ## Activity 1 (Introduction): My First Input
 1. Open your IntelliJ Idea IDE and follow the instructions below
 2. Create a project called 'MyFirstInput'
 3. Create a class called MyFirstInput
 4. Add a main method to your app.
 5. Make your code looks like the file shown below

 ```java
 package com.generation.java;
import java.io.Console;

class MyFirstInput {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("Please enter your name ");
    String name = console.readLine();

    System.out.println("My name is "+ name);
  }
}

```

6. Run your application.
7. Notice the prompt on the IntelliJ console asking you to enter your name.
8. Have a discussion with your pair partner on what you think each line of the code above does.

## Activity 2: My First Variable Naming

1. Open your IntelliJ Idea IDE and follow the instructions below
2. Create a project called MyFirstVariableNaming
3. Create a class titled "UserProfile"
4. Write code so that the app stores a users name, age, gender, job preference, nationality and blood type
5. Think about what variable names you want to assign to the properties above and variable name conventions to be followed.
6. Use the age to calculate the year when a user was born.
7. Print the values back to a user's console.

### Extra features
If you're able to implement the steps above with time to spare, add the following features to your app.
1. Instead of storing values in the static variables (variables manually assigned to values), have it so that a few variables are entered by a user through the console.


## Activity 3: Variable Naming and Type Casting
1. Open your IntelliJ Idea IDE and follow the instructions below
2. Create a project on IntelliJ. This time feel free to give it an appropriate name. *hint* We're going to be finding the area and perimeter of a circle.
3. Write a java application that prompts a user to enter the diameter of a circle and calculates the area and perimeter of the circle.
4. Perform a widening casting operation (integer to double) when storing the result of the operations.
5. Print out the results of the two operations in the console.

### Extra features
If you're able to implement the steps above with time to spare, check on your pair partner and ask if they need help.
