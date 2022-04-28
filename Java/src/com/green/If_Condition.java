package com.green;

public class If_Condition {

	public static void main(String[] args) {

		int a = 10;
		if (a > 5) {

			System.out.println("contion true");
		}

		else {
			System.out.println("condition false");
		}

		int i = 10;
		if (i > 5) {

			System.out.println("condition 1");

			if (i > 6) {

				System.out.println("condition 2");
			}

			else {
				System.out.println("invalid input 1");
			}

		} else {

			System.out.println("invalid input 2");
		}

		int m = 50;
		if (m < 20) {

			System.out.println("condition true");
		} else if (m < 40 && m > 60) {
			System.out.println("average");

		} else if (m > 60 || m > 40) {

			System.out.println("fail");

		} else {
			System.out.println("input fail");
		}

	}
}