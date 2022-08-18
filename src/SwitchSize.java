import java.util.Scanner;

class SwitchSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar : S , M , L , XL");
        String shortSize = scanner.nextLine();
        String size;

        switch (shortSize) {
            case "S":
                size = "mały";
            case "M":
                size = "średni";
            case "L":
                size = "duży";
            case "XL":
                size = "bardzo duży";
            default:
                size = "nieznany";
        }
        System.out.println("Wybrano rozmiar:" + size);
    }
}
