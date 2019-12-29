package Lec1;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int flag = 1;
		int i = 2;

		while (i < n) {

			if (n % i == 0) {
				flag = 2;
				System.out.println("Not Prime");
				break;
			}

			i = i + 1;
		}

		if (flag == 1)
			System.out.println("Prime");
	}

}
