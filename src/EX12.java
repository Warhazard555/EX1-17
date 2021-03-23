package by.epam.tr.main;

import java.util.Scanner;

public class EX12 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите 1-ый аргумент:");

		while (!sc.hasNextInt()) {
			System.out.println("Вы ввели не число");
			sc.nextLine();
		}
		a = sc.nextInt();

		System.out.println("Введите 2-ой аргумент:");
		while (!sc.hasNextInt()) {
			System.out.println("Вы ввели не число");
			sc.nextLine();
		}
		b = sc.nextInt();

		int summa = a + b;
		System.out.println("Сумма аргументов равна " + summa);

	}

}
