package test;

import java.util.Scanner;

public class Hometask3_3 {

	public static void main(String[] args) {
		double fx, x = 0;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
	
		
		do {
			System.out.print("Введите число х: ");
			if(sc.hasNextDouble()) {
				x = sc.nextDouble();
				flag = true;
			} else {
				System.out.print("/nВы ввели некорректное число/n");
			}
		} while(!flag);
		
		
		if(x <= 3) {
			fx = 9;
		} else {
			fx = 1 / (Math.pow(x, 2) + 1);
		}
		
		System.out.println("Значение функции F(x) равно " + fx);

	}

}
