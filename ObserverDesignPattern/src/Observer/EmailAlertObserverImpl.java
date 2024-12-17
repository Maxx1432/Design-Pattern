package Observer;

import Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StocksObservable stocksObservable;

    public EmailAlertObserverImpl(String userName, StocksObservable stocksObservable) {
        this.userName = userName;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName,"product is in stock hurry up!");
    }

    private void sendMsgOnMobile(String userName, String msg){
        System.out.println("msg sent to: "+userName);
    }
}
