package by.epam.tr.main;

import java.util.Scanner;

public class EX17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Введите число:");

		while (!sc.hasNextInt()) {
			System.out.println("Вы ввели не число");
			sc.nextLine();
		}
		x = sc.nextInt();
		if (x<=-3) {
			System.out.println("F(x) = " + 9);
		} 
		else {
			System.out.println("F(x) = " + (1/(Math.pow(x, 2)+1)));
		}


	}

}
