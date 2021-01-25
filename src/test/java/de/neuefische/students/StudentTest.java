package de.neuefische.students;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentTest {

    @ParameterizedTest
    @MethodSource
    public void studentTest(String name, String nameLast, int matNum, Student student){
        assertTrue(new Student(name,nameLast,matNum).equals(student));
    }
    private static Stream<Arguments> studentTest(){
        return Stream.of(
                Arguments.of("Peter","Gross",47064,new Student("Peter","Gross",47064)),
                Arguments.of("Horst","Klein",2118950, new Student("Horst","Klein",2118950)),
                Arguments.of("Tamara","Riesig",2119674, new Student("Tamara","Riesig",2119674))
        );
    }
}
