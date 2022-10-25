package currencyConvertor;

import java.util.Scanner;

public class CurrencyController {
	
	Scanner scanner = new Scanner(System.in);
	int userChoice;
	
	public void convertInr(double amount) {
		do {
			System.out.println("Select the currency in which you want to convert your amount");
			System.out.println("1. USD");
			System.out.println("2. EURO");
			System.out.println("3. POUND");
			System.out.println("4. YEN");
			System.out.println("0. Exit");
			userChoice = scanner.nextInt();
			switch(userChoice) {
			case 1:{
				System.out.println(amount+" INR is "+(amount*0.012)+" USD");
				break;
			}case 2:{
				System.out.println(amount+" INR is "+(amount*0.0123)+" EURO");
				break;
			}case 3:{
				System.out.println(amount+" INR is "+(amount*0.011)+" POUND");
				break;
			}case 4:{
				System.out.println(amount+" INR is "+(amount*1.82)+" YEN");
				break;
			}default:{
				System.out.println("You have Exited!");
				break;
			}
			}
		}while(userChoice!=0);
	};
	
	public void convertUsd(double amount) {
		do {
			System.out.println("Select the currency in which you want to convert your amount");
			System.out.println("1. INR");
			System.out.println("2. EURO");
			System.out.println("3. POUND");
			System.out.println("4. YEN");
			System.out.println("0. Exit");
			userChoice = scanner.nextInt();
			switch(userChoice) {
			case 1:{
				System.out.println(amount+" USD is "+(amount*82.68)+" INR");
				break;
			}case 2:{
				System.out.println(amount+" USD is "+(amount*1.02)+" EURO");
				break;
			}case 3:{
				System.out.println(amount+" USD is "+(amount*0.89)+" POUND");
				break;
			}case 4:{
				System.out.println(amount+" USD is "+(amount*147.20)+" YEN");
				break;
			}default:{
				System.out.println("You have Exited!");
				break;
			}
			}
		}while(userChoice!=0);
	};
	
	public void convertEuro(double amount) {
		do {
			System.out.println("Select the currency in which you want to convert your amount");
			System.out.println("1. INR");
			System.out.println("2. USD");
			System.out.println("3. POUND");
			System.out.println("4. YEN");
			System.out.println("0. Exit");
			userChoice = scanner.nextInt();
			switch(userChoice) {
			case 1:{
				System.out.println(amount+" EURO is "+(amount*81.11)+" INR");
				break;
			}case 2:{
				System.out.println(amount+" EURO is "+(amount*0.98)+" USD");
				break;
			}case 3:{
				System.out.println(amount+" EURO is "+(amount*0.87)+" POUND");
				break;
			}case 4:{
				System.out.println(amount+" EURO is "+(amount*144.81)+" YEN");
				break;
			}default:{
				System.out.println("You have Exited!");
				break;
			}
			}
		}while(userChoice!=0);
	};
	
	public void convertPound(double amount) {
		do {
			System.out.println("Select the currency in which you want to convert your amount");
			System.out.println("1. INR");
			System.out.println("2. USD");
			System.out.println("3. EURO");
			System.out.println("4. YEN");
			System.out.println("0. Exit");
			userChoice = scanner.nextInt();
			switch(userChoice) {
			case 1:{
				System.out.println(amount+" POUND is "+(amount*93.03)+" INR");
				break;
			}case 2:{
				System.out.println(amount+" POUND is "+(amount*1.13)+" USD");
				break;
			}case 3:{
				System.out.println(amount+" POUND is "+(amount*1.14)+" EURO");
				break;
			}case 4:{
				System.out.println(amount+" POUND is "+(amount*165.58)+" YEN");
				break;
			}default:{
				System.out.println("You have Exited!");
				break;
			}
			}
		}while(userChoice!=0);
	};
	
	public void convertYen(double amount) {
		do {
			System.out.println("Select the currency in which you want to convert your amount");
			System.out.println("1. INR");
			System.out.println("2. USD");
			System.out.println("3. POUND");
			System.out.println("4. EURO");
			System.out.println("0. Exit");
			userChoice = scanner.nextInt();
			switch(userChoice) {
			case 1:{
				System.out.println(amount+" YEN is "+(amount*0.56)+" INR");
				break;
			}case 2:{
				System.out.println(amount+" YEN is "+(amount*0.0068)+" USD");
				break;
			}case 3:{
				System.out.println(amount+" YEN is "+(amount*0.0061)+" POUND");
				break;
			}case 4:{
				System.out.println(amount+" YEN is "+(amount*0.0069)+" EURO");
				break;
			}default:{
				System.out.println("You have Exited!");
				break;
			}
			}
		}while(userChoice!=0);
	};
	
}
