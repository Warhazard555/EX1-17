package by.epam.tr.main;

import java.util.Scanner;

public class EX11 {

	public static void main(String[] args) {

		int a;
		int more15 = 0;
		int summ5 = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ð¡ÐºÐ¾Ð»ÑŒÐºÐ¾ Ñ‡Ð¸Ñ�ÐµÐ» Ð½ÑƒÐ¶Ð½Ð¾ Ð²Ð²ÐµÑ�Ñ‚Ð¸?");
		a = sc.nextInt();
		for (int i = 0; i <= a; i++) {
			if (i>15 || i<2) {
				more15++;
			}
			if (i % 5 == 4) {
				summ5 = summ5 + i;
			}
			

		}
		System.out.println("ÐšÐ¾Ð»Ð¸Ñ‡ÐµÑ�Ñ‚Ð²Ð¾ Ñ‡Ð¸Ñ�ÐµÐ» Ð±Ð¾Ð»ÑŒÑˆÐµ 15 Ð¸Ð»Ð¸ Ð¼ÐµÐ½ÑŒÑˆÐµ 2-ÑƒÑ…: " + more15);
		System.out.println("Ð¡ÑƒÐ¼Ð¼Ð° Ñ‡Ð¸Ñ�ÐµÐ» ÐºÑ€Ð°Ñ‚Ð½Ñ‹Ñ… 5-Ð¸ Ñ� Ð¾Ñ�Ñ‚Ð°Ñ‚ÐºÐ¾Ð¼ 4: " + summ5);
		

	}

}
