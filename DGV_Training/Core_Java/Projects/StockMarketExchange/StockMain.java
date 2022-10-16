package stockMarketExchange;

import java.util.Scanner;

public class StockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int userChoice;
		StockController stockController = new StockController();
		stockController.stockData();
		do {
			System.out.println();
			System.out.println("Please enter you choice");
			System.out.println("1.View All Stocks");
			System.out.println("2.View Detailed Performance of all stocks");
			System.out.println("3.Search stock");
			System.out.println("4.View sorted stocks on the basis of price");
			System.out.println("5.Profit");
			System.out.println("0.Exit game");
			userChoice=scanner.nextInt();
			scanner.nextLine();
			switch(userChoice) {
			case 1:{
				stockController.displayStocks();
				break;
			}case 2:{
				stockController.displayPerformance();
				break;
			}case 3:{
				System.out.println("Enter the stock name that you want to search");
				String stockName=scanner.nextLine();
				stockController.searchStock(stockName);
				break;
			}case 4:{
				stockController.sortStock();
				break;
			}case 5:{
				System.out.println("Enter the name of the stock");
				String stockName=scanner.nextLine();
				System.out.println("Enter the months for how much time you want to see the profit");
				int months=scanner.nextInt();
				stockController.stockProfit(stockName,months);
				break;
			}default:{
				System.out.println("You have exited the game!!");
			}
			}
		}while(userChoice!=0);
	}

}
