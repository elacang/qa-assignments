package homework03;

import java.util.Scanner;

public class printPyramid {

	private static Scanner in;

	public static void main(String[] args) {

		int input, line, spaces, stars;

		in = new Scanner(System.in);
		System.out.print("Enter number for the base of triangle: ");
		input = in.nextInt();
		System.out.println();

		for (line = 0; line < input; line++) {
			for (spaces = 0; spaces < line; spaces++) {
				System.out.print(" ");
			}
			for (stars = (input * 2 - line * 2 - 1); stars > 0; stars--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
