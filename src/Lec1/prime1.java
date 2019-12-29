package Lec1;

import java.util.Scanner;

public class prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int cnt = 0;
		int i = 1;

		while (i <= n) {

			if (n % i == 0) {
				cnt = cnt + 1;
			}
			i = i + 1;
		}

		if (cnt == 2) {
			System.out.println("Prime");
		} else {

			System.out.println("Not Prime");
		}

	}

}
