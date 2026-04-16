package org.patron.creacionales.fabricaAbstracta;

public class ConexionMitocodeOracle implements IConexionBDMitocode{

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	
	public ConexionMitocodeOracle() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
	}
	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("Se conect� a Oracle");
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("Se desconect� de Oracle");
	}
	@Override
	public String toString() {
		return "ConexionMitocodeOracle [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}

}
