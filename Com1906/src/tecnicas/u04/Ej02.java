/*
 * [...] ingresar dos n�meros enteros por
teclado utilizando un objeto Scanner. La computadora deber� mostrar su
cociente entero. El resto se deber� mostrar en otra l�nea. Ejemplo:
Ingresa 23 y 5, debe devolver 4 y, en otra l�nea, 3.
 */
package tecnicas.u04;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Declaro variables
		int a, b, cociente, resto;

		System.out.println("ingrese A: "); // Escribir
		a= teclado.nextInt(); // Leer num
		System.out.println("ingrese B: ");
		b= teclado.nextInt();

		cociente= a/b;
		resto= a%b;

		System.out.println("el resto es igual: " + resto);
		System.out.println("el cociente es igual: " + cociente);
	}

}
