package org.patron.fabrica;

public class ConexionMitocodePostgreSQL implements IConexionBDMitocode {
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	
	public ConexionMitocodePostgreSQL() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("Se conectó a PostgreSQL");
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("Se desconectó de PostgreSQL");
	}
	
	@Override
	public String toString() {
		return "ConexionMitocodePostgreSQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario
				+ ", contrasena=" + contrasena + "]";
	}
}
