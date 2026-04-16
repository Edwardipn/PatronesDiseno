package org.patron.fabricaAbstracta;

public interface FabricaAbstracta {
	IConexionBDMitocode getBD(String SGBD);
	IConexionRESTMitocode getREST(String area);
}
