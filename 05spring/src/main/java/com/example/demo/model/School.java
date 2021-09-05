package com.example.demo.model;

public class School implements ISchool {

    Student student;

    public School(Student student) {
        this.student = student;
    }

    @Override
    public void ding() {

        System.out.println("now has a student is " + this.student);

    }

}
