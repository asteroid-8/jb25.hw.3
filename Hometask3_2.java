package by.epam.jb25.hometask;

import java.util.Scanner;

public class Hometask3_2 {
	
	public static void main(String[] args) {
		double fx, a = 0, b = 0, h = 0;
		boolean flaga = false, flagb = false, flagh = false;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Введите число a: ");
			if(sc.hasNextDouble()) {
				a = sc.nextDouble();
				flaga = true;
			} else {
				System.out.print("/nВы ввели некорректное число/n");
			}
		} while (!flaga);
		
		
		
		do {
			System.out.print("Введите число b: ");
			if(sc.hasNextDouble()) {
				b = sc.nextDouble();
				flagb = true;
			} else {
				System.out.print("/nВы ввели некорректное число/n");
			}
		} while (!flagb);
		
		
		
		do {
			System.out.print("Укажите шаг: ");
			if(sc.hasNextDouble()) {
				h = sc.nextDouble();
				flagh = true;
			} else {
				System.out.print("/nВы ввели некорректное число/n");
			}
		} while (!flagh);
		
		
		System.out.println("x\tF(x)");
		for(double i = a; i <= b; i+=h) {
			System.out.print(i + "\t");
			fx = 2 * Math.tan(i / 2) + 1;
			System.out.println(fx);
		}
			
	}

}
