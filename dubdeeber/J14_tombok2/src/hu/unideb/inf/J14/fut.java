package hu.unideb.inf.J14;

import java.util.Scanner;

public class fut {

	public static void main(String[] args) {
		double[] tomb = new double[10];
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		double osszeg=0;
		Scanner reader = new Scanner(System.in);
		for (int i = 0; i < tomb.length; i++) {
			System.out.println("adj double most");
			String v = reader.next();
			tomb[i] = Double.parseDouble(v);
			if (min > tomb[i]) {
				min = tomb[i];
			}
			if (max < tomb[i]) {
				max = tomb[i];
			}
			osszeg+=tomb[i];
			System.out.println(tomb[i]);
		}
		System.out.println("min: " + min);
		System.out.println("max: " + max);
		System.out.println("osszeg: " + osszeg);
		System.out.println("atlag: " + (osszeg / tomb.length));
		reader.close();

	}

}
