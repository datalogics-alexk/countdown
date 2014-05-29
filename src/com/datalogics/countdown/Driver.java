package com.datalogics.countdown;

public class Driver {

	/**
	 * Counts down from 100 to 1 and prints every number not divisible by 7.
	 */
	private static void countdownSkip7() {
		for (int i = 100; i >= 1; --i) {
			if (i % 7 != 0) {
				System.out.println(i);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello, Git!");
		System.out.println("Let's count down from 100 to 1 and print every number not divisible by 7...");

		// TODO: implement me!
	}

}
