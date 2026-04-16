package org.patron.creacionales.fabrica;

public class ConexionMitocodeVacia implements IConexionBDMitocode {

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("No se espec�fico el SGBD");
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("No se espec�fico el SGBD");
	}

}
