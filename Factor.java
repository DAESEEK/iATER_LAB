package hw;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {

		int number;
		System.out.println("Calculate Greatest Common Factor");
		Scanner sc = new Scanner(System.in);
		System.out.print("Number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Number 2: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			number = num2;
		} else {
			number = num1;
		}
		while (!(num1 % number == 0 && num2 % number == 0)) {
			number--;
			
		}
		System.out.println("Factor : " + number);

	}

}
