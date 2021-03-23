package by.epam.tr.main;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ð’Ð²ÐµÐ´Ð¸Ñ‚Ðµ 1-Ð¾Ðµ Ñ‡Ð¸Ñ�Ð»Ð¾:");
		int a = sc.nextInt();
		System.out.println("Ð’Ð²ÐµÐ´Ð¸Ñ‚Ðµ 2-Ð¾Ðµ Ñ‡Ð¸Ñ�Ð»Ð¾:");
		int b = sc.nextInt();
		if (a > b) {
			System.out.println("Ð’Ð²ÐµÐ´Ð¸Ñ‚Ðµ 3-Ðµ Ñ‡Ð¸Ñ�Ð»Ð¾:");
			int c = sc.nextInt();
			System.out.println(b + c);
		} else if (a < b) {
			System.out.println("Ð’Ð²ÐµÐ´Ð¸Ñ‚Ðµ 3-Ðµ Ñ‡Ð¸Ñ�Ð»Ð¾:");
			int c = sc.nextInt();
			System.out.println(a + b + c);
			System.out.println("Ð�Ð¾Ð²Ñ‹Ð¹ Ð³Ð¾Ð´!");

		}
		else {
			System.out.println("ÐšÐ¾Ð½ÐµÑ†");
		}

	}

}
