import java.util.Scanner;

public class Input {
    private Scanner scan;

    public Input() {
        this.scan = new Scanner(System.in);
    }

    public int getOption(String message) {
        System.out.println(message);
        String input = this.scan.next();

    try {
        int number = Integer.parseInt(input);
            if (number >= 1 && number <= 5) {
                return number;
            }
            return getOption("Please enter a number within range.");

        } catch (Exception ignored) {
            return getOption("That wasn't a valid response.");
        }
    }

    public String getInput() {
        return this.scan.next();
    }
}
