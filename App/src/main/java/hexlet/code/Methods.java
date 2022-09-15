package hexlet.code;
import java.util.Scanner;

public class Methods {
    static Scanner sc = new Scanner(System.in);
    static final int greet = 1;
    static int choose = sc.nextInt();
    static void chooseOfGame() {
        if(choose == greet) {
            Cli.greeting();
        } else {
            return;
        }
    }
}
