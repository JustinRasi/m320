import java.util.Scanner;

public class Testklasse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Heizung Objekt
        Heizung heizung1 = new Heizung(25,10,30,5);
        heizung1.setIncrement(10);

        System.out.println(heizung1.getIncrement());

        System.out.println("Was moechtest du einstellen?\n[1] Temperatur hoeher stellen\n[2] Temperatur kaelter stellen");

        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1 -> Heizung.raiseTemperature();
            case 2 -> Heizung.reduceTemperature();
            default -> System.exit(0);
        }

    }
}
