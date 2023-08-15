package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Instructor
    extends Person
{

    private int experienceMonths;

    private final List<Course> teachingCourses = new ArrayList<>();

    protected Instructor( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public int getExperienceMonths()
    {
        return experienceMonths;
    }

    public void setExperienceMonths( int experienceMonths )
    {
        this.experienceMonths = experienceMonths;
    }
}
