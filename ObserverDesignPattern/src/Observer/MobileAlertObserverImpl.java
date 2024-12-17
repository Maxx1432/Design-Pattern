package Observer;

import Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StocksObservable stocksObservable;

    public MobileAlertObserverImpl(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }
    @Override
    public void update() {
     sendMail(emailId, "product is in stock hurry up!");
    }

    private void sendMail(String emailId, String msg){
        System.out.println("mail sent to: "+emailId);
    }
}
