
/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.ArrayList;

//executable class
public class MyMain
{
    public static void main(String[] args)
    {
        ArrayList<Student> studentList = new ArrayList<Student>(
        studentList.add(new Student(1, "Prakhar", 5, 4));
        studentList.add(new Student(2, "Aman", 0, 0));
        studentList.add(new Student(3, "Taran", 1, 1));
        studentList.add(new Student(4, "Rahul", 6, 3));
        studentList.add(new Student(5, "Abhishek", 0, 0));
        studentList.add(new Student(6, "Faizan", 4, 2));
        studentList.add(new Student(7, "Manish", 2, 1));
        studentList.add(new Student(8, "Harshraj", 1, 1));
        studentList.add(new Student(9, "Jayant", 0, 0));
        studentList.add(new Student(10, "Jay", 5, 0));
        studentList.add(new Student(11, "Kiran", 0, 0));

        MyCircularQueue ob = new MyCircularQueue();
        ob.enqueue(studentList);

        ob.printQueue();
    }
}
