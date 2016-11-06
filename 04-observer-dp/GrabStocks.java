public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.70);
        stockGrabber.setGOOGPrice(676.40);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.70);
        stockGrabber.setGOOGPrice(676.40);

        // Unregister observer
        stockGrabber.unregister(observer1);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.70);
        stockGrabber.setGOOGPrice(676.40);
    }
}
