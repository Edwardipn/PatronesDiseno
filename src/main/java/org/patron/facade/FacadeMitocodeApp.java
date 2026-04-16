package org.patron.facade;

public class FacadeMitocodeApp {

	public static void main(String[] args) {

		CheckFacadeMitocode cliente1 = new CheckFacadeMitocode();
		cliente1.buscar("02/07/2019", "02/09/2019", "Vallarta", "Puerto Rico");
		
		CheckFacadeMitocode cliente2 = new CheckFacadeMitocode();
		cliente2.buscar("02/07/2019", "02/09/2019", "España", "Mexico");
	}
}
