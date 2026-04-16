package org.patron.creacionales.fabrica;

public class ConexionMitocodeMySQL implements IConexionBDMitocode{

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	
	public ConexionMitocodeMySQL() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("Se conect� a MySQL");
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("Se desconect� de MySQL");
	}

	@Override
	public String toString() {
		return "ConexionMitocodeMySQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena=" + contrasena + "]";
	}

}
