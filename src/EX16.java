package by.epam.tr.main;

import java.util.Scanner;

public class EX16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		final double Pi = 3.1415926536;
		double dl;
		double s;
		double radius;
		
		System.out.println("Введите радиус:");
		while (!sc.hasNextDouble() || sc.hasNextInt()) {
			System.out.println("Это не вещественное число!!! Введите еще раз");
			sc.nextDouble();
		}
		radius = sc.nextDouble();
		dl = 2 * Pi * radius;
		s = Pi * Math.pow(radius, 2);
		System.out.println("Длина окружности для радиуса, равного " + radius + " = " + dl);
		System.out.println("Площадь круга для радиуса, равного " + radius + " = " + s);
		

	}

}
