package com.pablomonteserin;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		System.out.println("Introduce un n�mero");
		Scanner lector = new Scanner(System.in);
		int n = lector.nextInt();

		for (int i = 1; i <= 9; i++) {

			int r = n * i;
			System.out.println(n + " * " + i + " = " + r);
		}
	}

}
