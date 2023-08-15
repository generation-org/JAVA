
<img align="right" width="150" height="150" src="https://media-exp1.licdn.com/dms/image/C4E0BAQF7BYCCZt5epw/company-logo_200_200/0?e=2159024400&v=beta&t=qUAFP9bUgBEEXGVQYpUXW1J_OiP8e0r4rFBpqp8OrxA">

# Object Oriented Programming - Fundamentals

 <br/>
 <br/>
 
 
 ## Part 1: Exploring the HR System
 
 1. Download the src folder and import the project into IntelliJ Idea
 2. In this exercise, we'll create the Human Resources Management System mentioned in the theory section
 3. Create the following class


![](https://i.imgur.com/XBucIlB.png)


Implement the methods: 

 
 ```java
    public int timeToRetirement(){
       // time to retirement = min(60 - age, 40 - yearsWorked)
    }

    public int vacationTimeLeft(){
        // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
    }

    public int calculateBonus(){
        // bonus = 2.2*salary
    }
 ```
 
4. Now, create a sales rep class that *inherits* the original employee class
    * The arrow used means inheritance in class diagrams


![](https://i.imgur.com/z0nz3Db.png)


 ```java
    public int calculateComission(){
       // comission = 0.1 * salesMade
    }
  ```


5. Create a Java Class for sales manager:

![](https://i.imgur.com/oh1Keck.png)

 ```java
    public void calculateComission(){
       // 0.03 * all sales made by team
    }
 ```

6. Run the main method and verify that your implementation works.

## Challenge yourself

* Turn the HR system into a login system. There should be an interface called user
* The interface user should have username, password and implement the method login. The username and password must be private
* The login() implementation should simply check if the username and password in parameters match the user's username and password
* All employees should be users


 
