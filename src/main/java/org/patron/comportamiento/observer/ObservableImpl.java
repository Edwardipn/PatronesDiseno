package org.patron.comportamiento.observer;

import java.util.HashSet;
import java.util.Set;

public class ObservableImpl implements Observable{
	Set<Observer> observersSet = new HashSet<>();
	@Override
	public void addObserver(Observer observer) {
		observersSet.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		observersSet.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observersSet) {
			observer.update();
		}
		System.out.println("Observers notificados");
	}
}
