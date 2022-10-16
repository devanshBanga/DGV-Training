package stockMarketExchange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

public class StockController {
	
	ArrayList<Stock> stocks = new ArrayList<Stock>();
	
	public void stockData() {
		stocks.add(new Stock("HDFC Bank","Banking",800,1000.16,400.70,new double[] {400,550.67,750.50,600,780.50},15));
		stocks.add(new Stock("Tata Motors","Motor",450.54,550,200.45,new double[] {300.43,450.65,323.50,380,430},12));
		stocks.add(new Stock("Samsung","Electronics",350,500,250.70,new double[] {251,300,280.34,390.74,320.25},10));
		stocks.add(new Stock("Infosys","Technology",990.50,1200.45,700,new double[] {750,680,800,790.56,940.80},14));
	}
	
	public void displayStocks() {
		System.out.println("Name        "+" Category"+"   Price"+"   ROI");
		stocks.forEach((stock)->{
			System.out.println(stock.getName()+"    "+stock.getCategory()+"   "+stock.getPrice()+"   "+stock.getRoi());
		});
	}
	
	public void displayPerformance() {
        System.out.println("Name        "+" Category"+"   Price"+"   High52"+"   Low52"+"   ROI"+"            Last5");
		stocks.forEach((stock)->{
			System.out.print(stock.getName()+"    ");
			System.out.print(stock.getCategory()+"   ");
			System.out.print(stock.getPrice()+"   ");
			System.out.print(stock.getHigh52()+"   ");
			System.out.print(stock.getLow52()+"   ");
			System.out.print(stock.getRoi()+"   ");
			System.out.print("(");
			for(double n:stock.getLast5()) {
				System.out.print(n+", ");
			}
			System.out.print(")");
			System.out.println();
		});
	}
	
	public void searchStock(String name) {
		Optional <Stock> searchedStock = stocks.stream().filter((ss)->{
			return ss.getName().equals(name);
		}).findFirst();
		System.out.println("Name        "+" Category"+"   Price"+"   High52"+"   Low52"+"   ROI"+"            Last5");
		System.out.print(searchedStock.get().getName()+"    ");
		System.out.print(searchedStock.get().getCategory()+"   ");
		System.out.print(searchedStock.get().getPrice()+"   ");
		System.out.print(searchedStock.get().getHigh52()+"   ");
		System.out.print(searchedStock.get().getLow52()+"   ");
		System.out.print(searchedStock.get().getRoi()+"   ");
		System.out.print("(");
		for(double n:searchedStock.get().getLast5()) {
			System.out.print(n+", ");
		}
		System.out.print(")");
		System.out.println();
	}
	
	public void sortStock() {
		Collections.sort(stocks,new SortStock());
		this.displayStocks();
	}
	
	public void stockProfit(String name, int month) {
		Optional <Stock> searchedStock = stocks.stream().filter((ss)->{
			return ss.getName().equals(name);
		}).findFirst();
		System.out.println("The profit that you will gain by "+name+" if you invest for "+month+" months is "+((searchedStock.get().getPrice()*searchedStock.get().getRoi())/100)*month);
	}
	
}
