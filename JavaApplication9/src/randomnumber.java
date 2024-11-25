/*Se le solicita desarrollar un demo tipo juego, que permita generar un número
aleatorio y le rete al usuario que lo adivine. Si no adivina el número, el juego
debe sugerirle lo intente nuevamente con pistas (es mayor, menor, es par,
impar, es primo, pertenece a la serie de fibonacy, es multiplo de N, etc.), el
usuario es quien deberá ir pidiendo repetitivamente que el sistema le muestre o
no, más pintas, solo que, si el usuario pide más pistas, el sistema
automáticamente le resta un intento y le informa cuantos intentos le quedan. Al
finalizar el juego, se debe felicitar al usuario si gana y como, o pedir que lo
intente de nuevo.*/
import java.util.Scanner;

public class randomnumber {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int aleat = (int) (Math.random() * 100);
        int num, cont;
        String xd;
<<<<<<< HEAD
        cont = 15;
=======
        cont = 10;
>>>>>>> e94c6e98c5aede8b32bc6c12e8e130eda3889bf3
        while (true) {
            System.out.println("Tienes " + cont + " intentos");
            System.out.println("Adivina el numero del 0 al 100: ");
            num = tcl.nextInt();
            if (num == aleat) {
                System.out.println("Ganaste");
                break;
            }
<<<<<<< HEAD
            if (cont <= 0) {
                System.out.println("Perdiste");
                break;
            }
            cont--;
            if ((num != aleat) && (cont > 0)) {
                System.out.println("¿Quieres una pista?¿si o no? ");
                xd = tcl.next();

=======
            if (num != aleat) {
                System.out.println("¿Quieres una pista?¿si o no? ");
                xd = tcl.next();
>>>>>>> e94c6e98c5aede8b32bc6c12e8e130eda3889bf3
                if (xd.equals("si")) {
                    if (num > aleat) {
                        System.out.println("Es menor");

                    } else {
                        System.out.println("Es mayor");
                    }
                    cont--;
                }
                if (xd.equals("no")) {
                    System.out.println("Continua");
                }

            }

        }
    }
}
