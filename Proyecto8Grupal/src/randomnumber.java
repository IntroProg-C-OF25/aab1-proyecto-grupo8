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
        int num, cont, i;
        double red;
        String xd;

        cont = 15;

        while (true) {
            System.out.println("Tienes " + cont + " intentos");
            System.out.println("Adivina el numero del 0 al 100: ");
            num = tcl.nextInt();
            if (num == aleat) {
                System.out.println("Ganaste");
                break;
            }

            if (cont <= 0) {
                System.out.println("Perdiste");
                break;
            }
            cont--;
            if (cont >= 1) {

                if ((num != aleat) && (cont > 0)) {
                    System.out.println("¿Quieres una pista?¿si o no? ");
                    xd = tcl.next();

                    if (xd.equals("si") && (cont >= 10)) {
                        cont--;
                        if (num > aleat) {
                            System.out.println("Es menor");

                        } else {
                            System.out.println("Es mayor");
                        }

                    }
                    if (xd.equals("si") && ((cont < 10) && (cont >= 5))) {
                        for (i = 2; i < aleat; i++) {
                            red = aleat % i;
                            cont--;
                            if (red == 0) {
                                System.out.println("No es primo");
                                break;
                            } else {
                                System.out.println("Es primo");
                                break;
                            }
                        }
                    }
                    if (xd.equals("si") && (cont < 5)) {
                        if ((aleat % 2) == 0) {
                            System.out.println("Es par");
                        } else {
                            System.out.println("Es impar");
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
}

/*run:
Tienes 15 intentos
Adivina el numero del 0 al 100: 
98
�Quieres una pista?�si o no? 
si
Es menor
Tienes 13 intentos
Adivina el numero del 0 al 100: 
50
�Quieres una pista?�si o no? 
si
Es menor
Tienes 11 intentos
Adivina el numero del 0 al 100: 
25
�Quieres una pista?�si o no? 
si
Es mayor
Tienes 9 intentos
Adivina el numero del 0 al 100: 
35
�Quieres una pista?�si o no? 
si
Es mayor
Tienes 7 intentos
Adivina el numero del 0 al 100: 
40
�Quieres una pista?�si o no? 
si
Es menor
Tienes 5 intentos
Adivina el numero del 0 al 100: 
37
Ganaste
BUILD SUCCESSFUL (total time: 40 seconds)
 */
