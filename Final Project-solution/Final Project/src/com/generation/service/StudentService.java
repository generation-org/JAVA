package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public boolean isSubscribed( String studentId )
    {
        //TODO implement this method
        return students.containsKey(studentId);
    }

    public void showSummary()
    {
        //TODO implement
        System.out.println("-------------Student Summary -----------------------------------\n");

        for(String s : students.keySet()){
            if(isSubscribed(s)){
                System.out.println("Name : " + students.get(s).getName());
                System.out.println("DOB : " + students.get(s).getBirthDate());
                System.out.println("ID : " + students.get(s).getId());
                System.out.println("Email  : " + students.get(s).getEmail());
                System.out.println("Enrolled Courses : " + students.get(s).getApprovedCourses().size());
                for(Course c : students.get(s).getApprovedCourses()){
                    System.out.println(c.toString());
                }

                System.out.println("Passed Courses : " + students.get(s).passed.size());
                for(Course c : students.get(s).passed){
                    System.out.println(c.toString());
                }

                System.out.println("Average Credits : " + students.get(s).getAverage());
            }
            System.out.println("--------------------------------------");
            System.out.println();
        }

    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}
