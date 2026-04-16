package org.patron.creacionales.fabricaAbstracta;

public class FabricaConexionRESTMitocode implements FabricaAbstracta{

	@Override
	public IConexionBDMitocode getBD(String SGBD) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IConexionRESTMitocode getREST(String area) {
		// TODO Auto-generated method stub
		if(area.equalsIgnoreCase("compras")) {
			return new ConexionRESTMitocodeCompras();
		}else if(area.equalsIgnoreCase("ventas")) {
			return new ConexionRESTMitocodeVentas();
		}else if(area.equalsIgnoreCase("")) {
			return new ConexionRESTMitocodeNoArea();
		}
		
		return new ConexionRESTMitocodeNoArea();
	}
}
