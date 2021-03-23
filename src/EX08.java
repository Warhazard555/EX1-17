package by.epam.tr.main;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ð’Ð²ÐµÐ´Ð¸Ñ‚Ðµ 1-Ð¾Ðµ Ñ‡Ð¸Ñ�Ð»Ð¾:");
		int a = sc.nextInt();
		System.out.println("Ð’Ð²ÐµÐ´Ð¸Ñ‚Ðµ 2-Ð¾Ðµ Ñ‡Ð¸Ñ�Ð»Ð¾:");
		int b = sc.nextInt();
		if (a == b) {
			System.out.println("Ñ�ÐºÐ¾Ñ€Ð¾ Ð�Ð¾Ð²Ñ‹Ð¹ Ð“Ð¾Ð´!");

		} else {
			System.out.println("Ð’Ð²ÐµÐ´Ð¸Ñ‚Ðµ 3-Ðµ Ñ‡Ð¸Ñ�Ð»Ð¾:");
			int c = sc.nextInt();
			System.out.println(a + b + c);
			System.out.println(Math.pow(a, 2) + Math.pow(b, 2));
			System.out.println("ÐœÐ¾Ñ� Ð»ÑŽÐ±Ð¸Ð¼Ð°Ñ� Ñ„ÑƒÑ‚Ð±Ð¾Ð»ÑŒÐ½Ð°Ñ� ÐºÐ¾Ð¼Ð°Ð½Ð´Ð° - ÐœÐ¸Ð»Ð°Ð½");

		}

	}

}
