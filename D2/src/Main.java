import java.util.Scanner;

public class Main {

    //
    public static void main(String[] args) {

        Flug flug = new Flug();

        for (int i = 0; i < 5; i++) {
            System.out.println("Wie ist Ihr Name?");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.next();

            Passagier passagier = new Passagier(userInput);
            flug.passagierList.add(passagier);
        }
        flug.passagierListeAusgeben();
    }
}
