package Lec1;

import java.util.Scanner;

public class GCD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int gcd = Math.min(n1, n2);

		while (gcd >= 1) {

			if (n1 % gcd == 0 && n2 % gcd == 0) {
				break;
			}

			gcd = gcd - 1;

		}

		System.out.println(gcd);

	}

}
