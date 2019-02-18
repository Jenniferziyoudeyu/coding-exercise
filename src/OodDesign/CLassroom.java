package oodDesign;

import java.util.ArrayList;
import java.util.List;

public class CLassroom {
    int grade;
    int number;
    Obj obj;
    Student[] students;
    boolean isTaken;


    CLassroom(int number, Obj obj, Student[] students) {
        this.number = number;
        this.obj = obj;
        this.students = students;
        this.isTaken = false;
    }

    boolean addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                student.id = i + 1;
                return true;
            }
        }
        return false;
    }

    boolean deleteStudent(Student student) {
        for (int i = 0; i <students.length; i++) {
            if (students[i].equals(student)) {
                students[i] = null;
                return true;
            }
        }
        return false;
    }

    boolean replace(Student target, Student replace) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(target)) {
                students[i] = replace;
                return true;
            }
        }
        return false;
    }


    boolean find(int id) {
        for (Student student1 : students) {
            if (student1.id == id) {
                return true;
            }
        }
        return false;
    }
//重载 定义相同方法，参数不一样
    boolean find(String fullName) {
        for (Student student1 : students) {
            if (student1.fullName().equals(fullName)) {
                return true;
            }
        }
        return false;
    }

}

class Student {
    int id;
    String firstName;
    String lastName;
    String phoneNumber;
    Gender gender;
    String address;

    Student(int id, String firstName, String lastName, String phoneNumber, String address, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;

    }

    String fullName() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof Student) {
            return ((Student) obj).id == id;
        }return super.equals(obj);
    }
}
enum Gender {
    male,
    female
}

enum Obj {
    chairs,
    desks,
    blackboard,
    door
}
