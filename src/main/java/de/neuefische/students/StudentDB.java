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
}
