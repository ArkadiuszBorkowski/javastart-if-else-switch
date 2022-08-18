import java.util.Scanner;

class UserManager {
    public static void main(String[] args) {

        User user = new User("Jan", "Kowalski");


        System.out.println("Wybierz opcję:");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - wyświetl informacje o użytkowniku");
        System.out.println("2 - modyfikuj dane użytkownika");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        if (option == 0) {
            System.out.println("Bye bye!");
        } else if (option == 1) {
            System.out.println("Obecny użytkownik:" + user.getFirstName() + " " + user.getLastName());
        } else if (option == 2) {
            System.out.println("Wprowadź nowe imię użytkownika");
            user.setFirstName(scanner.next());
            System.out.println("Wprowadź nowe nazwisko użytkownika");
            user.setLastName(scanner.next());
            System.out.println("Zmieniono dane użytkownika na: " + user.getFirstName() + " " + user.getLastName());
        }

        String name = user.getFirstName();

        // all users
        final String name1 = "Jan";
        final String name2 = "Adam";
        final String name3 = "Damian";
        final String name4 = "Marian";

        switch (name) {
            case name1:
                System.out.println("Użytkownik Jan");
                break;
            case name2:
            case name4:
                System.out.println("Użytkownik Adam");
                break;
            case name3:
                System.out.println("Użytkownik Damian");
                break;
            default:
                System.out.println("Nieznany użytkownik");
        }
    }
}



