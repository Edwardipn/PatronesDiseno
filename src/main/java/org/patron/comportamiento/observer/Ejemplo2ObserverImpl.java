package org.patron.comportamiento.observer;

public class Ejemplo2ObserverImpl implements Observer {

	@Override
	public void update() {
		System.out.println("Se ha llamado a Ejemplo2ObserverImpl");
	}

}
