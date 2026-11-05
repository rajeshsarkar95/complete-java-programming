import java.util.*;

record Student(String name, int marks) {}

public class SortObjects {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
            new Student("Ravi", 76),
            new Student("Asha", 91),
            new Student("Neha", 84)
        ));

        students.sort(Comparator.comparingInt(Student::marks).reversed());
        students.forEach(System.out::println);
    }
}
