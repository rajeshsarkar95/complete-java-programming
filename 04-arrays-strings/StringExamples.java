public class StringExamples {
    public static void main(String[] args) {
        String text = "Java Programming";
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Contains Java: " + text.contains("Java"));

        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}
