import java.util.Scanner;

class SwitchSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar : S , M , L , XL");
        String shortSize = scanner.nextLine();

        String size = switch (shortSize) {
            case "S":
                yield "mały";
            case "M":
                yield "średni";
            case "L":
                yield "duży";
            case "XL":
                yield "bardzo duży";
            default:
                yield "nieznany";
        };

        System.out.println("Wybrano rozmiar:" + size);
    }
}
