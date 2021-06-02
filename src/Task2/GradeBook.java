package Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GradeBook {



    HashMap<String, Integer> gradeBookMap = new HashMap<>();

    public static void main(String[] args) {
        Set<String> namesOfStudents = TestResult.listOfStudentsNames();
        HashMap<String, Integer> firstTest = TestResult.getOriginalGrades();
        HashMap<String, Integer> secondTest = TestResult.getMakeUpGrades();

        HashMap<String, Integer> gradeBookMap = new HashMap<>();

       //firstTest.forEach((key,value) -> if(firstTest.values() > secondTest.values()) -> gradeBookMap.add(firstTest(key,value)));

       /* firstTest.forEach((key, value) -> (firstTest.get(key) > secondTest.get(key)) ? gradeBookMap.put(firstTest(key,value)) :
                gradeBookMap.put(secondTest(key,value));*/



        for (Map.Entry <String, Integer> rec : firstTest.entrySet()) {
            if ((rec.getValue() > secondTest.get(rec.getKey()))) {
                gradeBookMap.put(rec.getKey(), rec.getValue());
            } else {
                gradeBookMap.put(rec.getKey(), secondTest.get(rec.getKey()));
            }
        }

        gradeBookMap.forEach((key,value) -> System.out.println(key + " " + value));

    }




}
