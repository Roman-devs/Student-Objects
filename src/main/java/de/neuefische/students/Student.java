package de.neuefische.students;

import java.util.Objects;

public class Student {
    // Member Variablen
    private String name;
    private String nameLast;
    private int matNum;
    // Constructor
    public Student(String name, String nameLast, int matNum){
        this.name = name;
        this.nameLast = nameLast;
        this.matNum = matNum;
    }
    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public int getMatNum() {
        return matNum;
    }

    public void setMatNum(int matNum) {
        this.matNum = matNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matNum == student.matNum && Objects.equals(name, student.name) && Objects.equals(nameLast, student.nameLast);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nameLast, matNum);
    }

    @Override
    public String toString() {
        return name + " " + nameLast + " " + matNum;
    }
}
