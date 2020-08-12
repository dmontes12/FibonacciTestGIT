/**
	Diego Montes
*/

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int indice = 0;

		System.out.println("Ingresa el indice del numero que quieres obtener de la serie Fibonacci: ");
		indice = leer.nextInt();

		int a = 0;
		int b = 1;
		int c = 0;
		if (indice < 0) {
			System.out.println("Ingresa un numero mayor a 0 e intenta otra vez");
		} else {
			if (indice == 1) {
				System.out.println(a);
			} else if (indice == 2) {
				System.out.println(b);
			} else {
				for (int i = 2; i < indice; i++) {
					c = a + b;
					a = b;
					b = c;
				}
				System.out.println("El numero con indice " + indice + " es: " + b);
			}
		}
	}

}
