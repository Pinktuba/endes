/**
 * 
 */
package main;

import java.util.Scanner;

/**
 * @author tardes T2 Gracia Fecha: 23 oct. 2020
 * @verison
 */

public class Personalizado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		System.out.println("Introduce un número: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce otro número: ");
		num2 = teclado.nextInt();
		teclado.close();
		System.out.println("Resta de " + num1 + " y " + num2+ " es: " +(num1 - num2));

		
	}
}