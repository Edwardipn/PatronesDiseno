package org.patron.creacionales.fabrica;

public class FabricaConexionBDMitocode {
	public IConexionBDMitocode getConexionMitocode(String SGBD) {
		if(SGBD.equalsIgnoreCase("MySQL")) {
			return new ConexionMitocodeMySQL();
		}else if(SGBD.equalsIgnoreCase("ORACLE")) {
			return new ConexionMitocodeOracle();
		}else if(SGBD.equalsIgnoreCase("PostgreSQL")) {
			return new ConexionMitocodePostgreSQL();
		}else if(SGBD.equalsIgnoreCase("SQL Server")) {
			return new ConexionMitocodeSQLServer();
		}
		
		return new ConexionMitocodeVacia();
	}
}
