package Lec1;

import java.util.Scanner;

public class GCD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int dividend = scn.nextInt();
		int divisor = scn.nextInt();

		while (dividend % divisor != 0) {

			int rem = dividend % divisor;

			dividend = divisor;
			divisor = rem;

		}
		
		System.out.println(divisor);
		
		

	}

}
