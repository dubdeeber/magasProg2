package hu.unideb.inf.J13;

import java.util.Scanner;

public class Fut {

	public static void main(String[] args) {
		String[] tomb=new String[10];
		
		Scanner reader=new Scanner(System.in);
		for (int i = 0; i < tomb.length; i++) {
			System.out.println("adj string most");
			tomb[i]=reader.next();
		}
		reader.close();
		System.out.println(tomb);

	}

}
