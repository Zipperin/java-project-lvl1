package hexlet.code.games;

import java.util.Scanner;

public class Cli {
    public static void welcome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""

                Welcome to the Brain Games!
                May I have your name?\s""");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }

}
