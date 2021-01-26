package de.neuefische.students;

public class StudentRandomizer {

    public static void main(String[] args) {
        StudentDB students = new StudentDB(new Student[]{
                new Student("Peter","Lustig",47064),
                new Student("Majo","Knabe",47063),
                new Student("Silke","Unlustig",47061),
                new Student("Petter","Dumm",47064),
                new Student("Leonhard","Squirrel",785),
                new Student("Florian","Shabby",785)
        });
        for (int i = 0; i < 15; i++) {
            System.out.println(students.getRandomStudent());
        }

    }
}
