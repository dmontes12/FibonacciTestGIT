
/**
	Diego Montes
*/

import java.util.Scanner;

public class Fibonacci {

	public static int Fibonacci(int n) {

		if (n == 1) {
			return 0;
		}
		if (n == 2) {
			return 1;
		}

		return Fibonacci(n - 1) + Fibonacci(n - 2);
	}

	public static int FibonacciIterativo(int n) {
		int a = 0;
		int b = 1;
		int c = 0;

		if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		} else {
			for (int i = 2; i < n; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			return b;
		}

	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int indice = 0;

		System.out.println("Ingresa el indice del numero que quieres obtener de la serie Fibonacci: ");
		indice = leer.nextInt();
		if (indice > 0) {

			int opcion = 0;
			System.out.println("Elija la opcion \n1.-Iterativa\n2.- Recursiva");
			opcion = leer.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("El numero: " + FibonacciIterativo(indice));
				break;

			case 2:
				System.out.println("El numero: " + FibonacciIterativo(indice));
				break;
			default:
				System.out.println("Elije una opcion valida");
			}
		} else {
			System.out.println("Ingresa un numero mayor a 0");
		}
	}

}
