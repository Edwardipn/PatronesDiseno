package org.patron.creacionales.fabricaAbstracta;

public class AppFabricaAbstracta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
		IConexionBDMitocode cxBD = fabricaBD.getBD("MySQL");
		cxBD.conectar();
		
		FabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");
		IConexionRESTMitocode cxREST = fabricaREST.getREST("Ventas");
		cxREST.leerURL("localhost:8080/Ventas");
	}

}
