import java.util.*;

public class CollectionExamples {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Asha", "Raj", "Asha"));
        Set<String> uniqueNames = new HashSet<>(names);

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Asha", 90);
        scores.put("Raj", 82);

        Queue<String> tasks = new ArrayDeque<>();
        tasks.offer("Compile");
        tasks.offer("Test");

        System.out.println(names);
        System.out.println(uniqueNames);
        System.out.println(scores.get("Asha"));
        System.out.println(tasks.poll());
    }
}
