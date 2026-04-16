package org.patron.facade;

public class CheckFacadeMitocode {
	
	private AvionMitocodeApi avionAPI;
	private HotelMitocodeApi hotelAPI;
	
	public CheckFacadeMitocode() {
		avionAPI = new AvionMitocodeApi();
		hotelAPI = new HotelMitocodeApi();
	}
	public void buscar(String fechaIda,String fechaVuelta, String origen, String destino) {
		avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
		hotelAPI.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
	}
}
