package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String username;
    StocksObservable observable;

    @Override
    public void update() {
        sendMsgOnMobile(username,"product is in stock, hurry up");
    }

    private void sendMsgOnMobile(String emailId, String msg){
        System.out.println("msg sent to: "+emailId);
    }
}
