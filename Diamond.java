package iATER;

import java.util.Scanner;

public class Diamond {

	static void my_method(int num) {

		for (int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = num - 1; i > 0; i--) {
			for (int j = i; j < num; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number:");
		int number = scanner.nextInt();

		my_method(number);

	}

}
