import java.util.Optional;

public class OptionalExample {
    static Optional<String> findUsername(int id) {
        return id == 1 ? Optional.of("asha") : Optional.empty();
    }

    public static void main(String[] args) {
        String username = findUsername(1).orElse("guest");
        System.out.println(username);
    }
}
