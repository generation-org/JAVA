
<img align="right" width="150" height="150" src="https://media-exp1.licdn.com/dms/image/C4E0BAQF7BYCCZt5epw/company-logo_200_200/0?e=2159024400&v=beta&t=qUAFP9bUgBEEXGVQYpUXW1J_OiP8e0r4rFBpqp8OrxA">

# Java IDE - IntelliJ Idea 

 <br/>
 <br/>
 
 
 ## Part 1: Creating my First Java Project on IntelliJ Idea
 1. Open the IntelliJ Idea App and follow the instructions to create a new Java Project.
 2. Edit the Main class so it prints "Hello Wolrd!" message:

    ```java
    package com.generation.java;
    
    public class Main {
    
        public static void main(String[] args) {
    		System.out.println( "Hello World!" );
        }
    }
    
    ```
3. Run your application using the run button next to the *main* method.
4. Run your application using the run button next to the *main* class declaration.
5. Add a breakpoint to line 6 of your application *System.out.println( "Hello World!" );*
6. Add 3 or 4 lines more to your code with the same instruction *System.out.println()* but a different message. 
6. Run your application on Debug mode and verify how the following buttons of the debug view work:
    * Step Over
    * Step Into
    * Step Out
    * Resume Program
7. Add the following code to your application *main* method:
     ```java
    package com.generation.java;
    
    public class Main {
        public static void main(String[] args) {
    		String test = "Hello";
    		test+= " World!";
    		test+= " Welcome to Generation";
        }
    }
    ```   
8. Add a breakpoint to first line *String test = "Hello";*
9. Run your application again on Debug mode and observe how the variable test changes.

 ## Part 2: Importing an existing project into IntelliJ Idea
 1. Download this repository
 2. Exctract the downloaded files
 3. Click on the *File* menu of the IDE and select the option open project and select the folder of the exctracted files
 4. Browse the project files and try to understand what the programm does.
 5. Change the name passed on the main method to your name and run the program to verify it works.
