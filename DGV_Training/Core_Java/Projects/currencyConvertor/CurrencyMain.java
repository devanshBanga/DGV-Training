package currencyConvertor;

import java.util.Scanner;

public class CurrencyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int userChoice;
		CurrencyController currencyController = new CurrencyController();
		do {
			System.out.println();
			System.out.println("Please enter your choice about the currency that you want to convert");
			System.out.println("1. INR");
			System.out.println("2. USD");
			System.out.println("3. EURO");
			System.out.println("4. POUND");
			System.out.println("5. YEN");
			System.out.println("0. Exit");
			userChoice = scanner.nextInt();
			double amount;
			switch(userChoice) {
			case 1:{
				System.out.println("Enter amount");
				amount = scanner.nextInt();
				currencyController.convertInr(amount);
				break;
			}case 2:{
				System.out.println("Enter amount");
				amount = scanner.nextInt();
				currencyController.convertUsd(amount);
				break;
			}case 3:{
				System.out.println("Enter amount");
				amount = scanner.nextInt();
				currencyController.convertEuro(amount);
				break;
			}case 4:{
				System.out.println("Enter amount");
				amount = scanner.nextInt();
				currencyController.convertPound(amount);
				break;
			}case 5:{
				System.out.println("Enter amount");
				amount = scanner.nextInt();
				currencyController.convertYen(amount);
				break;
			}default:{
				System.out.println("You have exited!");
				break;
			}
			}
		}while(userChoice!=0);
	}

}
