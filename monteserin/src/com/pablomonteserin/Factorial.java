package com.pablomonteserin;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Introduce un número");
		Scanner lector = new Scanner(System.in);
		
		int n = lector.nextInt();
		int r=n;
		
		while(n>1) {
			n--;
			r = r *n;
			
		}
		
		System.out.println(r);

	}

}
