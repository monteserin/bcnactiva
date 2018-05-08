package com.pablomonteserin.depositosConstructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		int i = 2;
		int j = 2;
		System.out.println("antes");
		try{
			System.out.println(i/j);
		}catch (ArithmeticException e){
			System.out.println("en catch1");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("en catch2");
		}catch(Throwable t){
			System.out.println("en catch3");
		}finally{
			System.out.println("en finally");
		}
		System.out.println("despues");
	}

}
