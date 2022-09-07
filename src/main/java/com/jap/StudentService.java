package com.jap;

import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData(){
        //create six student object by calling Student class parameterized constructor
       HashSet<Student> students = new HashSet<>();
        students.add(new Student("john",23,500));
        students.add(new Student("Bob",26,545));
        students.add(new Student("kevin",29,489));
        students.add(new Student("johnson",30,578));
        students.add(new Student("catherine",25,490));
        //return the HashSet object


        return students;
    }


    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet){
        //Create a TreeSet object
        TreeSet<String> studentset1 = new TreeSet<>();
        Iterator <Student> iterator = studentSet.iterator();
        while (iterator.hasNext()) {
            Student element  = iterator.next();
            String name = element.getName();
            studentset1.add(name);
        }



        //Use Iterator object of type <Student> to iterate through the studentSet

        //get all the name and add it inside the TreeSet object

      //return the TreeSet object;
        return studentset1;
    }

    public static Map<String,Integer> calculateAverage(Set<Student> studentSet){
        //create a HashMap object of type <String,Integer>
        HashMap<String,Integer> hashMap = new HashMap<>();

        //Use Iterator object of type <Student>to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();
        //retrieve the Student object from the iterator
        while (iterator.hasNext()){
            Student element = iterator.next();

            hashMap.put(element.getName(),element.getTotalMarks()/studentSet.size() );
        }

        //Use getter method to get TotalMarks of each student. calculate the average

        //add the student name and average marks in the HashMap object created in the
        //first line and return the map

           return hashMap;

    }

    public static void main(String[] args) {
        Set studentName = getAllStudentData();
        System.out.println(getAllStudentNameInSorted(studentName));
        System.out.println(calculateAverage(studentName));
    }


}
