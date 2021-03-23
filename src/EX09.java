package by.epam.tr.main;

import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {

		int a;
		int chet = 0;
		int summ3 = 0;
		int abs = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ð¡ÐºÐ¾Ð»ÑŒÐºÐ¾ Ñ‡Ð¸Ñ�ÐµÐ» Ð½ÑƒÐ¶Ð½Ð¾ Ð²Ð²ÐµÑ�Ñ‚Ð¸?");
		a = sc.nextInt();
		for (int i = 0; i <= a; i++) {
			if (i % 2 == 0) {
				chet++;
			}
			if (i % 3 == 0) {
				summ3 = summ3 + i;
			}
			if (Math.abs(i) < 3) {
				abs++;
			}

		}
		System.out.println("ÐšÐ¾Ð»Ð¸Ñ‡ÐµÑ�Ñ‚Ð²Ð¾ Ñ‡ÐµÑ‚Ð½Ñ‹Ñ… Ñ‡Ð¸Ñ�ÐµÐ»: " + chet);
		System.out.println("Ð¡ÑƒÐ¼Ð¼Ð° Ñ‡Ð¸Ñ�ÐµÐ» ÐºÑ€Ð°Ñ‚Ð½Ñ‹Ñ… 3-ÐµÐ¼: " + summ3);
		System.out.println("Ð§Ð¸Ñ�Ð»Ð° Ñ� Ð¼Ð¾Ð´ÑƒÐ»ÐµÐ¼ Ð¼ÐµÐ½ÑŒÑˆÐµ 3-ÐµÑ…: " + abs);

	}

}
