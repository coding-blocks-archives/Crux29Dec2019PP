package Lec1;

import java.util.Scanner;

public class naturnNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int cnt = 1;
		int sum = 0;

		while (cnt <= n) {

			sum = sum + cnt;
			cnt = cnt + 1;
		}

		System.out.println(sum);

	}

	
	
	
}
