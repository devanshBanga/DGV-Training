package stockMarketExchange;

import java.util.Comparator;

public class SortStock implements Comparator<Stock>{

	@Override
	public int compare(Stock stock1, Stock stock2) {
		return Double.compare(stock2.getPrice(), stock1.getPrice());
	}
	
}
