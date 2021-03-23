package by.epam.tr.main;

import java.util.Scanner;

public class EX13a {

	public static void main(String[] args) {

		int a;
		int b;
		int c;

		Scanner conin = new Scanner(System.in);
		System.out.println("a=");
		a = conin.nextInt();
		System.out.println("b=");
		b = conin.nextInt();
		System.out.println("c=");
		c = conin.nextInt();

		double s = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3) * c + b);
		System.out.println(s);

	}

}
