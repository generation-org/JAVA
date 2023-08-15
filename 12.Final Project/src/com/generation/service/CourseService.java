package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Module;
import com.generation.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseService
{
    private final Map<String, Course> courses = new HashMap<>();

    private final Map<String, List<Student>> enrolledStudents = new HashMap<>();

    public CourseService()
    {
        Module module = new Module( "INTRO-CS", "Introduction to Computer Science",
                                    "Introductory module for the generation technical programs" );
        registerCourse( new Course( "INTRO-CS-1", "Introduction to Computer Science", 9, module ) );
        registerCourse( new Course( "INTRO-CS-2", "Introduction to Algorithms", 9, module ) );
        registerCourse( new Course( "INTRO-CS-3", "Algorithm Design and Problem Solving - Introduction ", 9, module ) );
        registerCourse( new Course( "INTRO-CS-4", "Algorithm Design and Problem Solving - Advanced", 9, module ) );
        registerCourse( new Course( "INTRO-CS-5", "Terminal Fundamentals", 9, module ) );
        registerCourse( new Course( "INTRO-CS-6", "Source Control Using Git and Github", 9, module ) );
        registerCourse( new Course( "INTRO-CS-7", "Agile Software Development with SCRUM", 9, module ) );

        Module moduleWebFundamentals = new Module( "INTRO-WEB", "Web Development Fundamentals",
                                                   "Introduction to fundamentals of web development" );
        registerCourse( new Course( "INTRO-WEB-1", "Introduction to Web Applications", 9, moduleWebFundamentals ) );
        registerCourse( new Course( "INTRO-WEB-2", "Introduction to HTML", 9, moduleWebFundamentals ) );
        registerCourse( new Course( "INTRO-WEB-3", "Introduction to CSS", 9, moduleWebFundamentals ) );
        registerCourse( new Course( "INTRO-WEB-4", "Advanced HTML", 9, moduleWebFundamentals ) );
        registerCourse( new Course( "INTRO-WEB-5", "Advanced CSS", 9, moduleWebFundamentals ) );
        registerCourse( new Course( "INTRO-WEB-6", "Introduction to Bootstrap Framework", 9, moduleWebFundamentals ) );
        registerCourse(
            new Course( "INTRO-WEB-7", "Introduction to JavaScript for Web Development", 9, moduleWebFundamentals ) );

    }

    public void registerCourse( Course course )
    {
        courses.put( course.getCode(), course );
    }

    public Course getCourse( String code )
    {
        if ( courses.containsKey( code ) )
        {
            return courses.get( code );
        }
        return null;
    }

    public void enrollStudent( String courseId, Student student )
    {
        if ( !enrolledStudents.containsKey( courseId ) )
        {
            enrolledStudents.put( courseId, new ArrayList<>() );
        }
        enrolledStudents.get( courseId ).add( student );
    }

    public void showEnrolledStudents( String courseId )
    {
        if ( enrolledStudents.containsKey( courseId ) )
        {
            List<Student> students = enrolledStudents.get( courseId );
            for ( Student student : students )
            {
                System.out.println( student );
            }
        }
    }


    public void showSummary()
    {
        System.out.println( "Available Courses:" );
        for ( String key : courses.keySet() )
        {
            Course course = courses.get( key );
            System.out.println( course );
        }
        System.out.println( "Enrolled Students" );
        for ( String key : enrolledStudents.keySet() )
        {
            List<Student> students = enrolledStudents.get( key );
            System.out.println( "Students on Course " + key + ": " );
            for ( Student student : students )
            {
                System.out.println( student );
            }
        }
    }
}
