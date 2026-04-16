package org.patron.creacionales.fabricaAbstracta;

public class FabricaConexionBDMitocode implements FabricaAbstracta{

	@Override
	public IConexionBDMitocode getBD(String SGBD) {
		// TODO Auto-generated method stub
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

	@Override
	public IConexionRESTMitocode getREST(String area) {
		// TODO Auto-generated method stub
		return null;
	}
}
