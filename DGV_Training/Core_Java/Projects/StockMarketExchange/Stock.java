package stockMarketExchange;

public class Stock {

	private String name;
	private String category;
	private double price;
	private double high52;
	private double low52;
	private double[] last5;
	private double roi;
	
	public Stock(String name, String category, double price, double high52, double low52, double[] last5, double roi) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.high52 = high52;
		this.low52 = low52;
		this.last5 = last5;
		this.roi = roi;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public double getHigh52() {
		return high52;
	}

	public double getLow52() {
		return low52;
	}

	public double[] getLast5() {
		return last5;
	}

	public double getRoi() {
		return roi;
	}
	
	
	
}
