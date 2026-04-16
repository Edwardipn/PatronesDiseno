package org.patron.creacionales.fabrica;

public class AppBDFabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabricaConexionBDMitocode fabrica = new FabricaConexionBDMitocode();
		
		IConexionBDMitocode cx1= fabrica.getConexionMitocode("");
		cx1.conectar();
		cx1.desconectar();
		
		IConexionBDMitocode cx2=fabrica.getConexionMitocode("Oracle");
		cx2.conectar();
		cx2.desconectar();
	}

}
