/*
 * Escribir un codigo que categorice la calificacion ingresada por un docente
	de la siguiente forma (utilice una estructura de seleccion):
	9-10: Ha obtenido una calificacion sobresaliente
	7-8: Ha obtenido una calificacion notable
	4-6: Ha obtenido un aprobado
	1-3: Ha desaprobado
	Validar que la nota ingresada se encuentre entre 1 y 10.
*/
package tecnicas.u03;

import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingrese la nota del alumno: ");
		int nota = ent.nextInt();

		if (nota >= 1 && nota <= 10) {
			switch (nota) {
			case 1:
			case 2:
			case 3:
				System.out.println("Ha desaprobado");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("Ha aprobado");
				break;
			default:
				System.out.println("Debe ingresar una nota v�lida.");
				break;
			}
		}
	}
}
