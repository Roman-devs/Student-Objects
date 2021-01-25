package de.neuefische.students;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class StudentDBTest {
    // Testing Method for List Method
    @ParameterizedTest
    @MethodSource
    public void studentDBTestListMethod(StudentDB studentDB, String[] expectedResult){
        assertArrayEquals(studentDB.listStudents(),expectedResult);
    }
    private static Stream<Arguments> studentDBTestListMethod(){
        return Stream.of(
                arguments(new StudentDB(new Student[]{
                        new Student("Peter","Lustig",47064),
                        new Student("Majo","Knabe",47063),
                        new Student("Silke","Unlustig",47061),
                        new Student("Petter","Dumm",47064),
                        new Student("Leonhard","Squirrel",47032),
                        new Student("Florian","Shabby",785)
                }), new String[]{"Peter Lustig","Majo Knabe","Silke Unlustig","Petter Dumm","Leonhard Squirrel","Florian Shabby"})
        );
    }

    // Testing Method for toString
    @ParameterizedTest
    @MethodSource
    public void studentDBtoStringMethodTest(StudentDB studentDB, String expectedResult){
        assertEquals(studentDB.toString(),expectedResult);
    }
    private static Stream<Arguments> studentDBtoStringMethodTest(){
        return Stream.of(
                arguments(new StudentDB(new Student[]{
                        new Student("Peter","Lustig",47064),
                        new Student("Majo","Knabe",47063),
                        new Student("Silke","Unlustig",47061),
                        new Student("Petter","Dumm",47064),
                        new Student("Leonhard","Squirrel",785),
                        new Student("Florian","Shabby",785)
                }),"[Peter Lustig 47064, Majo Knabe 47063, Silke Unlustig 47061, Petter Dumm 47064, Leonhard Squirrel 785, Florian Shabby 785]")
        );
    }
}
