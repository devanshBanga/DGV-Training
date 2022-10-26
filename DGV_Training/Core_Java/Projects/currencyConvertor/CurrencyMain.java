package currencyConvertor;

import java.util.Scanner;

public class CurrencyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int userChoice,userChoice2;
		CurrencyController currencyController = new CurrencyController();
		currencyController.getData();
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
			System.out.println("Please enter your choice that in which currency you want to convert");
			System.out.println("1. INR");
			System.out.println("2. USD");
			System.out.println("3. EURO");
			System.out.println("4. POUND");
			System.out.println("5. YEN");
			userChoice2 = scanner.nextInt();
			double amount;
			System.out.println("Enter amount");
			amount = scanner.nextInt();
			currencyController.convertCurrency(amount,userChoice-1,userChoice2-1);
		}while(userChoice!=0);
	}

}
