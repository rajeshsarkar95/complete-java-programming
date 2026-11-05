import java.util.*;

public class StudentGradeManager {
    public static void main(String[] args) {
        Map<String, Integer> marks = new LinkedHashMap<>();
        marks.put("Asha", 91);
        marks.put("Ravi", 76);
        marks.put("Neha", 84);

        marks.forEach((name, score) -> {
            String grade = score >= 90 ? "A" : score >= 75 ? "B" : score >= 60 ? "C" : "D";
            System.out.println(name + " | " + score + " | " + grade);
        });
    }
}
