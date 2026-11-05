import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("sample.txt");
        Files.writeString(path, "Learning Java file handling\n", StandardCharsets.UTF_8);
        String content = Files.readString(path, StandardCharsets.UTF_8);
        System.out.println(content);
    }
}
