package by.epam.tr.main;

import java.util.Scanner;

public class EX13b {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;

		Scanner conin = new Scanner(System.in);
		System.out.println("a=");
		a = conin.nextInt();
		System.out.println("b=");
		b = conin.nextInt();
		System.out.println("c=");
		c = conin.nextInt();
		System.out.println("d=");
		d = conin.nextInt();

		double s = (a/c)*(b/d)-((a*b-c)/(c*d));
		System.out.println(s);
		

	}

}
