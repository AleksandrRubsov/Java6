package com.company;

public class Student {
    private String name;
    private int gpa;
    private int ID;
    public Student(){

    }
    public Student(String name,int gpa,int ID){
        this.name=name;
        this.gpa=gpa;
        this.ID=ID;
    }
    public int getGpa(){
        return gpa;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return ID;
    }
    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setID(int ID){
        this.ID=ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", ID=" + ID +
                '}';
    }
}