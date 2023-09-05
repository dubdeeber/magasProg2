package hu.unideb.inf.J11;

import java.util.Scanner;

//import java.io.Console;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		//Console c=System.console(); nem működik
		System.out.println("adj string most");
		while(reader.hasNext()) {
			String v=reader.next();
			System.out.println("ez volt: "+v);
			System.out.println("adj string most");
			
		}
			
		
		
	}

}
