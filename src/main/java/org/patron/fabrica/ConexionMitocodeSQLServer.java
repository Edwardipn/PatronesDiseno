package org.patron.fabrica;

public class ConexionMitocodeSQLServer implements IConexionBDMitocode {
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	
	public ConexionMitocodeSQLServer() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("Se conectó a SQL Server");
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("Se desconectó de SQL Server");
	}

	@Override
	public String toString() {
		return "ConexionMitocodeSQLServer [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario
				+ ", contrasena=" + contrasena + "]";
	}
}
