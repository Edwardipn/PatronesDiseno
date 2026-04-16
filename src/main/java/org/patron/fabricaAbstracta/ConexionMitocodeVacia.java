package org.patron.fabricaAbstracta;

public class ConexionMitocodeVacia implements IConexionBDMitocode {

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("No se específico el SGBD");
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("No se específico el SGBD");
	}

}
