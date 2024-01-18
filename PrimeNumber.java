package hw;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int primeNumber;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		primeNumber = sc.nextInt();
		for (int i = 1; i <= primeNumber; i++) {
			if (primeNumber % i == 0) {
				count++;
			}
		}
		System.out.println(count);
		if (count == 2) {
			System.out.println(primeNumber + " is prime number");
		} else {
			System.out.println(primeNumber + " is not prime number");
		}
	}

}
