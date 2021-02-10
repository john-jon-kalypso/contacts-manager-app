import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactsMenu {

    public ContactsMenu() throws IOException, InterruptedException {
//        Scanner scan = new Scanner(System.in);
        Path filepath = Paths.get("contacts.txt");
        boolean valid = false;

        List<String> contacts = Files.readAllLines(filepath);

//        System.out.println("Name | Phone Number");
//        System.out.println("-------------------");
//        for (String contact : contacts) {
//                System.out.println(contact);
//            }
//        System.out.println("1. View Contacts.\n2. Add Contact.\n3. Search by Name.\n4. Delete Contact.\n5. Exit.\nEnter Option (1, 2, 3, 4 or 5)");
        Input scan = new Input();

        do {
            System.out.println("-== Contacts Manager Menu ==-");
            int menuNumber = scan.getOption("\n1. View Contacts\n" +
                    "2. Add Contact\n" +
                    "3. Search by Name\n" +
                    "4. Delete Contact\n" +
                    "5. Exit\nEnter Option (1, 2, 3, 4 or 5)");

            contacts = Files.readAllLines(filepath);
            if (menuNumber == 1) {
                for (String contact : contacts) {
                    System.out.println(contact);
                }
            } else if (menuNumber == 2) {
                System.out.println("Add a new contact?");
            } else if (menuNumber == 3) {
                Files.write(Paths.get("src", "contacts.txt"), Arrays.asList("3"), StandardOpenOption.APPEND);
            } else if (menuNumber == 4) {
                System.out.println("Delete contact?");
            } else {
                System.out.println("Goodbye");
            }

            } while (true);

    }
}
