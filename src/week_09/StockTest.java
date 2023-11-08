package assignments.week_09;

public class StockTest {
    public static void main(String[] args) {

        Stock stock = new Stock("ORCL", "Oracle Corporation");
        System.out.println("Stock name : " + stock.name);
        System.out.println("Stock name : " + stock.symbol);
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);


        double changePercent = stock.getChangePercent();
        System.out.println("Price-change percentage: " + changePercent);
    }
}
