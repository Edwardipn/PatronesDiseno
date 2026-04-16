package org.patron.creacionales.fabricaAbstracta;

public class FabricaProductor {
	public static FabricaAbstracta getFactory(String tipoFabrica) {
		if(tipoFabrica.equalsIgnoreCase("BD")) {
			return new FabricaConexionBDMitocode();
		}else if(tipoFabrica.equalsIgnoreCase("REST")) {
			return new FabricaConexionRESTMitocode();
		}
		return null;
	}
}
