package de.neuefische.students;

import java.util.Arrays;

public class StudentDB {
    // Member Variablen
    private Student[] students;
    // Constructor
    public StudentDB(Student[] students){
        this.students = students;
    }
    // Getter & Setter
    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    // List - Method
    public String[] listStudents(){
        String[] listOfNames = new String[this.students.length];
        for (int i = 0; i < this.students.length; i++) {
            listOfNames[i] = this.students[i].getName()
                    + " " + this.students[i].getNameLast();
        }
        return listOfNames;
    }
    // toString - Method
    @Override
    public String toString() {
        return Arrays.toString(students);
    }

    // random - Method
    public Student getRandomStudent(){
        return this.students[(int)(Math.random() * students.length)];
    }
    // Add Student to the Student Array (Object Array consisting of object of the Student Class)
    public void addStudentToArray(Student newStudent){
        Student[] afterAdditionArray = new Student[this.students.length + 1];
        for (int i = 0; i < this.students.length; i++) {
            afterAdditionArray[i] = this.students[i];
        }
        afterAdditionArray[this.students.length] = newStudent;
        this.students = afterAdditionArray;
    }
    // Remove student Object from Student Database Array
    public void removeStudentToArray(Student oldStudent){
        Student[] afterRemovalArray = new Student[this.students.length - 1];
        for (int i = 0; i < this.students.length-1; i++) {
           if (!this.students[i].equals(oldStudent)){
            afterRemovalArray[i] = this.students[i];
           }
           }
        this.students = afterRemovalArray;
    }
}
