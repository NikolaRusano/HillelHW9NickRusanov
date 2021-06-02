package Task2;

import java.util.HashMap;
import java.util.Set;

public class GradeBook {



    HashMap<String, Integer> gradeBookMap = new HashMap<>();

    public static void main(String[] args) {
        Set<String> namesOfStudents = TestResult.listOfStudentsNames();
        HashMap<String, Integer> firstTest = TestResult.getOriginalGrades();
        HashMap<String, Integer> secondTest = TestResult.getMakeUpGrades();

        HashMap<String, Integer> gradeBookMap = new HashMap<>();

       firstTest.forEach((key,value) -> if(firstTest.values() > secondTest.values()) -> gradeBookMap.add(firstTest(key,value)));
    }




}
