public class Conditions {
    public static void main(String[] args) {
        int marks = 78;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 60) {
            System.out.println("Grade B");
        } else {
            System.out.println("Needs improvement");
        }

        String day = "MONDAY";
        switch (day) {
            case "MONDAY" -> System.out.println("Start of the week");
            case "FRIDAY" -> System.out.println("Almost weekend");
            default -> System.out.println("Regular day");
        }
    }
}
