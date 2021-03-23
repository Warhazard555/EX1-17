package by.epam.tr.main;

import java.util.Scanner;

public class EX14 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите 1-ое число:");

		while (!sc.hasNextInt()) {
			System.out.println("Вы ввели не число");
			sc.nextLine();
		}
		a = sc.nextInt();

		System.out.println("Введите 2-ое число:");
		while (!sc.hasNextInt()) {
			System.out.println("Вы ввели не число");
			sc.nextLine();
		}
		b = sc.nextInt();

		System.out.println("Введите 3-е число:");
		while (!sc.hasNextInt()) {
			System.out.println("Вы ввели не число");
			sc.nextLine();
		}
		c = sc.nextInt();

		System.out.println("a = " + step(a));
		System.out.println("b = " + step(b));
		System.out.println("c = " + step(c));

	}

	public static int step(int a) {
		if (a > 0) {

			a = (int) Math.pow(a, 2);
		} else {
			a = (int) Math.pow(a, 4);

		}
		return a;
	}

}
