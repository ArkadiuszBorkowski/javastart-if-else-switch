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
        }
        }



