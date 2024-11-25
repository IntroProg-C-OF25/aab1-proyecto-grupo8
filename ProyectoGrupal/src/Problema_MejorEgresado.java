/* La UTPL, cada fin de periodo realiza las ceremonias de incorporación de sus
nuevos profesionales de todas las carreras. En dicha ceremonia de entre todos
los puntos desarrollados en la agenda, uno de los más relevantes es el
discurso del mejor egresado de la promoción. Para elegirlo, las autoridades de
entre algunos aspectos, considera su rendimiento académico durante toda la
carrera, es aquí en donde la UTPL le contrata con el objetivo de colaborar en la
automatización de este proceso de cálculo y generación de resultados
académicos dados los siguientes lineamientos:

- Autogenere los estudiantes con los datos/atributos necesarios (lo básico es
su nombre y promedio final) con el fin de realizar la comparativa de su
rendimiento académico entre todos los estudiantes a graduarse y así poder
elegir al mejor egresado con el mayor promedio.

- Realizar los cálculos y/o comparativas para filtrar al estudiante con el mayor
promedio de egreso.

- Al finalizar dicho proceso, como resultado Ud. debe mostrar los datos
completos del mejor egresado, y el por qué fue elegido de entre todo el
grupo.

- Considerar la excepción/probabilidad de que puedan existir máximo 2
mejores egresados
 * @author Jorge Guerrero
 */

import java.util.Scanner;

public class Problema_MejorEgresado {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double nota, notamax, max2;
        int cont, lim;
        String alum, alumgod, alumgod2;
        System.out.print("Cuantos estudiantes va a inscribir?: ");
        lim = tcl.nextInt();
        cont = 1;
        notamax = -1;
        max2 = 0;
        alumgod = "";
        alumgod2 = " ";
        while (lim >= cont) {
            System.out.print("Ingresar el nombre y promedio del estudiante: ");
            alum = tcl.next();
            nota = tcl.nextDouble();
            if (nota > notamax) {
                notamax = nota;
                alumgod = alum;
            } else if (notamax == nota) {
                alumgod2 = alum;
                max2 = nota;
            }

            cont++;

        }
        if (max2 == 0) {
            System.out.println("El estudiante " + alumgod + " es el mejor promedio con " + notamax);
        } else {
            System.out.println("El estudiante " + alumgod + " y el estudiante " + alumgod2 + " consiguieron la nota mas alta con " + notamax);
        }

    }
}

/* run:
Cuantos estudiantes va a inscribir?: 5
Ingresar el nombre y promedio del estudiante: Jorge 9,6
Ingresar el nombre y promedio del estudiante: Andres 9,5
Ingresar el nombre y promedio del estudiante: Pedro 2
Ingresar el nombre y promedio del estudiante: Ricardo 5,9
Ingresar el nombre y promedio del estudiante: Polla 10
El estudiante Polla es el mejor promedio con 10.0
BUILD SUCCESSFUL (total time: 28 seconds)
*/