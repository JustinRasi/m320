import java.util.Scanner;

public class Heizung {

    // Variables
    private int temperature;
    private int min;
    private int max;
    private int increment;

    // Getter and setter
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }
    public int getIncrement() {
        return increment;
    }
    public void setIncrement(int increment) {
        this.increment = increment;
    }

    // Constructor
    public Heizung(int temperature, int min, int max, int increment) {
        this.temperature = temperature;
        this.min = min;
        this.max = max;
        this.increment = increment;
    }

    public static void raiseTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Um wie viel Grad moechtest du die Temperatur erhoehen?");
        int userInput = scanner.nextInt();
        Heizung test = new Heizung(5,10,23,0);
        if (test.temperature + userInput > test.max) {
            System.out.println("Die angegebene Temperatur ueberschreitet den Erlaubten Wert: "+test.max+"\nVersuche es erneut.");
            raiseTemperature();
        }
        else {
            test.setIncrement(test.temperature + userInput);
            System.out.println("Die neue Temperatur ist nun: "+test.getIncrement());
        }

    }

    public static void reduceTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Um wie viel Grad moechtest du die Temperatur senken?");
        int userInput = scanner.nextInt();
        Heizung test = new Heizung(15,10,20,0);
        if (test.temperature - userInput < test.min) {
            System.out.println("Die angegebene Temperatur unterschreitet den Erlaubten Wert: "+test.min+"\nVersuche es erneut.");
            reduceTemperature();
        }
        else {
            test.setIncrement(test.temperature - userInput);
            System.out.println("Die neue Temperatur ist nun: "+test.getIncrement());
        }
    }
}