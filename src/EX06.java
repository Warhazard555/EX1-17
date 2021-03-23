package by.epam.tr.main;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Ð²ÐµÐ´Ð¸Ñ‚Ðµ 1-Ð¾Ðµ Ñ‡Ð¸Ñ�Ð»Ð¾:");
	int a = sc.nextInt();
	System.out.println("Ð²ÐµÐ´Ð¸Ñ‚Ðµ 2-Ð¾Ðµ Ñ‡Ð¸Ñ�Ð»Ð¾:");
	int b = sc.nextInt();
	System.out.println("Ð²ÐµÐ´Ð¸Ñ‚Ðµ 3-Ð¾Ðµ Ñ‡Ð¸Ñ�Ð»Ð¾:");
	int c = sc.nextInt();
	
	double s = Math.pow(a, 2)-Math.pow((b-c),2)+Math.log(Math.pow(b, 2)+1);
	System.out.println("Ð ÐµÐ·ÑƒÐ»ÑŒÑ‚Ð°Ñ‚ Ð²Ñ‹Ñ‡Ð¸Ñ�Ð»ÐµÐ½Ð¸Ñ� Ñ€Ð°Ð²ÐµÐ½ " + s);
	
	}

}
