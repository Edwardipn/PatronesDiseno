package org.patron.estructurales.facade;

public class AvionMitocodeApi {
	public void buscarVuelos(String fechaIda, String fechaVuelta, String origen, String destino) {
		System.out.println("===============");
		System.out.println("Vuelos encontrados para "+destino+" desde "+origen);
		System.out.println("Fecha IDA: "+fechaIda+" fecha vuelta "+fechaVuelta);
		System.out.println("==========================");
	}
}
