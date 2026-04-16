package org.patron.comportamiento.observer;

public interface Observable {
	void addObserver(Observer observer);
	void deleteObserver(Observer observer);
	void notifyObservers();
}
