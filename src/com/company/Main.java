package com.company;

import  java.util.Arrays;
import java.util.Random;
public class Main {
    static int k=0;
    public static Student getSt(){
        int a=1+(int)(Math.random()*100);
        int b=1+(int)(Math.random()*100);
        return new Student("Student "+(k++),a,b);
    }
    public static void main(String[] args) {
        System.out.println("УПРАЖНЕНИЕ №1");
        iDNumber ar1=new iDNumber(9);
        for(int i=0;i<9;i++){
            Student student=getSt();
            ar1.add(student);
        }
        for(int i=0;i<9;i++){
            System.out.println("name: "+ar1.get(i).getName()+" ID: "+ar1.get(i).getID());
        }
        System.out.println("After sort:");
        ar1.Sort();
        for(int i=0;i<9;i++){
            System.out.println("name: "+ar1.get(i).getName()+" ID: "+ar1.get(i).getID());
        }
        System.out.println("УПРАЖНЕНИЕ №2");
        Student[] ar2=new Student[9];
        for (int i=0;i< ar2.length;i++){
            ar2[i]=getSt();
        }
        for(int i=0;i<9;i++){
            System.out.println(ar2[i]);
        }
        Arrays.sort(ar2,new SortingStudentsByGPA());
        System.out.println("After sort:");
        for(int i=0;i<9;i++){
            System.out.println(ar2[i]);
        }
        System.out.println("УПРАЖНЕНИЕ №3");
        Student[] std1=new Student[4];
        Student[] std2=new Student[4];

        for(int i=0;i<4;i++){
            std1[i]=getSt();
            std2[i]=getSt();
        }
        for(int i=0;i<4;i++){
            System.out.println(std1[i]+"\t"+std2[i]);
        }
        Arrays.sort(std1, new SortingStudentsByGPA());
        Arrays.sort(std2, new SortingStudentsByGPA());
        Student[] a3=mergeSort(std1,std2);
        System.out.println();
        for(int i=0;i<8;i++){
            System.out.println(a3[i]);
        }
    }
    public static Student[] mergeSort(Student[] a1, Student[] a2) {
        Student[] a3 = new Student[a1.length + a2.length];

        int i = 0, j = 0;
        for (int k = 0; k < a3.length; k++) {

            if (i > a1.length - 1) {
                Student a = a2[j];
                a3[k] = a;
                j++;
            } else if (j > a2.length - 1) {
                Student a = a1[i];
                a3[k] = a;
                i++;
            } else if (a1[i].getGpa() < a2[j].getGpa()) {
                Student a = a1[i];
                a3[k] = a;
                i++;
            } else {
                Student b = a2[j];
                a3[k] = b;
                j++;
            }
        }
        return a3;
    }
}
