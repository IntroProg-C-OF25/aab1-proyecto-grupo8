
import java.util.Scanner;

public class JavaApplication21 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n, i;
        double red;
        red = -1;
        System.out.println("Pon un numero");
        n = tcl.nextInt();
        for (i = 2; i < n; i++) {
            red = n % i;
            if (red == 0) {
                System.out.println("No es primo");
                break;
            }
        }
        if (red != 0) {
            System.out.println("Es primo");
        }

    }

}
