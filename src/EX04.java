package by.epam.tr.main;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Введите длину катета:");
	int a = sc.nextInt();
	System.out.println("Введите длину 2-ого катета:");
	int b = sc.nextInt();
	double gypo = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); 
	System.out.println("Длина гипотенузы равна " + gypo);
	double s = (a*b)/2;
	System.out.println("Площадь треугольника равна " + s);
	
	}

}
