package Observable;

public interface StocksObservable {
    public void add();
    public void remove();
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
