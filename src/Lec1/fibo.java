package Lec1;

import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int a = 0;
		int b = 1;

		int i = 1;

		while (i <= n + 1) {

			int sum = a + b;

			System.out.print(a + " ");

			// update
			a = b;
			b = sum;

			i = i + 1;
		}

	}

}
