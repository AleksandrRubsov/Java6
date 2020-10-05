package com.company;

import java.util.Comparator;
public class SortingStudentsByGPA implements Comparator<Student> {
    public int compare(Student a1,Student a2){
        return a1.getGpa()-a2.getGpa();
    }
}