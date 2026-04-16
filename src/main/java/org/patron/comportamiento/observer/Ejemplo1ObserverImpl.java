package org.patron.comportamiento.observer;

public class Ejemplo1ObserverImpl implements Observer {

	@Override
	public void update() {
		System.out.println("Se ha llamado a Ejemplo1ObserverImpl");
	}

}
