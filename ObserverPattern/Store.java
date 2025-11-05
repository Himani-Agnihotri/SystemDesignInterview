package ObserverPattern;

public class Store {
    public static void main(String args[]){
        ObserverPattern.Observable.StocksObservable iphoneStocksObservable = new ObserverPattern.Observable.IPhoneObservableImpl();

        ObserverPattern.Observer.NotificationAlertObserver observer1 = new ObserverPattern.Observer.EmailAlertObserverImpl("himani.a2395@gmail.com",iphoneStocksObservable);
        ObserverPattern.Observer.NotificationAlertObserver observer2 = new ObserverPattern.Observer.EmailAlertObserverImpl("h.a2395@gmail.com",iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);

        iphoneStocksObservable.setStockCount(10);
    }
}
