package hw7UseOfNestedlf;

import java.util.Scanner;

public class DiabeticCondition {
	public static void main(String[] args) {

		System.out.println("--------Please enter your Hemoglobin A1C value below---------");

		Scanner scanner = new Scanner(System.in);

		double level = scanner.nextDouble();

		if (level >= 6.4) {
			System.out.println("You are a diabetic patient");
		} else if (level < 6.4) {
			System.out.println("Congratulations, You are not diabetic");
			if (level >= 5.7)
				System.out.println("You are a pre-diabetic patient");
			if (level < 5.7)
				System.out.println("You are a healthy person");
		} else {
			System.out.print("Your result is invalid. ");

		}
		System.out.println("Thank You!");

	}
}
