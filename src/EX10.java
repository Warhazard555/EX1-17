package by.epam.tr.main;

import java.util.Scanner;

public class EX10 {

	public static void main(String[] args) {

		int a = 0;
		double b = 0;
		int c = 0;
		int chet = 0;
		int more15 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество чисел:");
		a = sc.nextInt();
		for (int i = 0; i < a; i++) {

			System.out.println("Вводите вещественные числа");

			while (!sc.hasNextDouble() || sc.hasNextInt()) {
				System.out.println("Это не вещественное число!!! Введите еще раз");
				sc.nextDouble();
			}
			b = sc.nextDouble();
			c = (int) b;
			
			if (c%2==0) {
				
				chet++;
				
			}
			if (c>15) {
				
				more15++;
				
			}
		}
		System.out.println("Количество четных чисел: " + chet);
		System.out.println("Количество чисел больше 15: " + more15);
			
			
		

	}

}
