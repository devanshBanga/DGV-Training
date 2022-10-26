package currencyConvertor;

import java.util.ArrayList;
import java.util.Scanner;

public class CurrencyController {
	
	Scanner scanner = new Scanner(System.in);
	int userChoice;
	
	ArrayList<CurrencyConvertor> currency = new ArrayList<CurrencyConvertor>();
	
	public void getData(){
		currency.add(new CurrencyConvertor(new double[] {1,0.012,0.0123,0.011,1.82}));
		currency.add(new CurrencyConvertor(new double[] {82.68,1,1.02,0.89,147.20}));
		currency.add(new CurrencyConvertor(new double[] {81.11,0.98,1,0.87,144.81}));
		currency.add(new CurrencyConvertor(new double[] {93.03,1.13,1.14,1,165.58}));
		currency.add(new CurrencyConvertor(new double[] {0.56,0.0068,0.0061,0.0069,1}));
	}
	
	public void convertCurrency(double amount,int userChoice,int userChoice2) {
		System.out.println("Converted amount is "+amount*currency.get(userChoice).getArray()[userChoice2]);
	}
	
}
