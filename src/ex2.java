import java.util.Random;

class ex2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(10000);

        System.out.println("Wylosowana liczba to " + x);

        ex2Logic numberUnits = new ex2Logic();
        numberUnits.compareNumberAndPrint(x, 5000);
        numberUnits.printOddorEven(x);

        System.out.println("Uzupełniona do 4 cyfr: " + numberUnits.getFourDigitNumber(x));

    }
}
