package decisionMaker;

import java.util.Scanner;

public class DecisionMaker {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		int userNum = 1;
		char userChoice = 'y';
		String userName = "-";

		System.out.print("Hello! What should I call you? ");
		userName = scnr.nextLine();

		System.out.println();
		System.out.println("What a fantastic name, " + userName + "!");
		System.out.println();

		while (userChoice == 'y' || userChoice == 'Y') {

			do {
				System.out.print("Enter a number between 1 and 100: ");
				userNum = scnr.nextInt();
			} while (userNum < 1 || userNum > 100);

			if (userNum % 2 != 0) {
				System.out.println(userName + ", the number you entered is " + userNum + " and it is odd.");
			} else if (userNum % 2 == 0 && userNum >= 2 && userNum <= 25) {
				System.out.println(
						userName + ", the number you entered is " + userNum + " and it is even and less than 25.");
			} else if (userNum % 2 == 0 && userNum >= 26 && userNum <= 60) {
				System.out.println(userName + ", the number you entered is " + userNum + " and it is even.");
			} else if (userNum % 2 == 0 && userNum > 60) {
				System.out.println(userName + ", the number you entered is " + userNum + " and it is even.");
			} else if (userNum % 2 != 0 && userNum > 60) {
				System.out.println(userName + ", the number you entered is " + userNum + " and it is odd and over 60.");
			} else {
				System.out.println("Weird.");
			}
			
			System.out.println();

			do {
				System.out.print("Would you like to continue? (y/n) ");
				userChoice = scnr.next().charAt(0);
			} while (userChoice != 'n' && userChoice != 'N' && userChoice != 'y' && userChoice != 'Y');
			
			System.out.println();
		}

		System.out.print("Thank you! Goodbye!");

		scnr.close();
	}

}