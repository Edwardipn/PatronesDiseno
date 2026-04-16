package org.patron.comportamiento.observer;

public class AppObserver {

	public static void main(String[] args) {
/*
 * 		ObservableImpl observableImpl = new ObservableImpl();
		observableImpl.notifyObservers();*/
/*
 * 		ObservableImpl observableImpl = new ObservableImpl();
		observableImpl.addObserver(new Ejemplo1ObserverImpl());
		observableImpl.addObserver(new Ejemplo2ObserverImpl());
		observableImpl.notifyObservers();*/
		
		ObservableImpl observableImpl = new ObservableImpl();
		observableImpl.addObserver(new Ejemplo1ObserverImpl());
		observableImpl.addObserver(new Ejemplo2ObserverImpl());
		observableImpl.notifyObservers();
		observableImpl.addObserver(new Ejemplo3ObserverImpl());
		observableImpl.notifyObservers();

	}

}
