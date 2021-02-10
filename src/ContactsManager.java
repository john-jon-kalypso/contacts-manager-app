public class ContactsManager {
    public static void main(String[] args) {

    }

    public String name;
    public String number;


    public ContactsManager(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getInfo() {
        return name + " | " + number;
    }



}
