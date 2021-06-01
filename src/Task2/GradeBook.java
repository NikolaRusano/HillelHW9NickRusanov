package Task2;

import java.util.HashMap;
import java.util.Set;

public class GradeBook {

    Set<String> namesOfStudents = TestResult.listOfStudentsNames();
    HashMap<String, Integer> firstTest = TestResult.getOriginalGrades();
    HashMap<String, Integer> secondTest = TestResult.getMakeUpGrades();

    HashMap<String, Integer> gradeBookMap = new HashMap<>();

}
