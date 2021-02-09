import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ContactsRunner {
    public static void main(String[] args) throws IOException {

        Path filepath = Paths.get("contacts.txt");
//        Files.createFile(filepath);

        List<String> contacts = Arrays.asList(
                "Alex Smith, 0001234567",
                "Bernard Davis, 1234567890",
                "Charlie Rodriguez, 9871234848",
                "Denise Lesley, 1357908642",
                "Edwardo Espinoza, 0157292984",
                "Fredrick Chap, 451231290",
                "Gregory Cook, 1239873456"
        );
        Files.write(filepath, contacts);

    }
}
