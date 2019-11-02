package ejerc;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {

		Scanner ingreso = new Scanner(System.in);

		System.out.println("ingrese valor 1");
		int valor = ingreso.nextInt();

		System.out.println("ingrese valor 2");
		int valor2 = ingreso.nextInt();

		int total = valor + valor2;

		System.out.println(" El total es: " + total);

		ingreso.close();

	}
}
