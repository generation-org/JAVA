
<img align="right" width="150" height="150" src="https://media-exp1.licdn.com/dms/image/C4E0BAQF7BYCCZt5epw/company-logo_200_200/0?e=2159024400&v=beta&t=qUAFP9bUgBEEXGVQYpUXW1J_OiP8e0r4rFBpqp8OrxA">

# Object Oriented Programming - Fundamentals

 <br/>
 <br/>
 
 
 ## Part 1: Exploring the School System Project
 
 1. Create a new Java project using IntelliJ Idea.
 2. Create a *Student* class. This class must have the following attributes:

 ```java
    public class Student {
        String firstName;
        String lastName;
        int registration;
        int grade;
        int year;
    }
 ```

3. Now, make the *Student* class implement the following methods:

 
 ```java
    public void printFullName(){
       //TODO implement
    }

    public void isApproved(){
        //TODO implement: should return true if grade >= 60
    }

    public int changeYearIfApproved(){
        //TODO implement: the student should advance to the next year if he/she grade is >= 60
        // Make year = year + 1, and print "Congragulations" if the student has been approved
        return 0;
    }
 ```
 
4. Add constructors to your Student class:

    * Make the class with at least three different constructors.

5. Create a Java class for Courses

    * Your Course class must have, as attributes: courseName, professorName, year.
    * Your class must also contain a collection that lists all students enrolled in them.
    * Implement the following methods.

 
 ```java
    public void enroll(Student student){
       //TODO add the student to the collection
    }

    public void unEnroll(Student student){
        //TODO remove this student from the collection
        // Hint: check if that really is this student
    }

    public int countStudents(){
        //TODO implement
        return 0;
    }
    
    public int bestGrade(){
        //TODO implement
        return 0;
    }
 ```

6. Run the main method and verify that your implementation works.

7. Method Overload:
    * Overload the enroll method to take in an array of students.

 ```java
    public void enroll(Student[] students){
       //TODO add all the students to the collection
    }
 ```
  * Add on to the main method and call enroll with a list of students. Verify that your implementation works.

## Challenge yourself

* Implement a function that calculates the average grade for that course.
* Implement a function that outputs a ranking with all students enrolled in a course and respective grades.
* Implement a function that, for each student, show if he/she is above course average or not.



 
