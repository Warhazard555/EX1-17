package by.epam.tr.main;

import java.util.Scanner;

public class EX15 {

	public static void main(String[] args) {
		int a;
		int b;
		int h;
		double f;
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

		System.out.println("Введите шаг:");
		while (!sc.hasNextInt()) {
			System.out.println("Вы ввели не число");
			sc.nextLine();
		}
		h = sc.nextInt();
		for (int i =a;i<b;i=i+h) {
			
			f = 2 * Math.tan(i/2) + 1;
			System.out.print(i + "  |  ");
			System.out.println(f);
		}

	}

}
