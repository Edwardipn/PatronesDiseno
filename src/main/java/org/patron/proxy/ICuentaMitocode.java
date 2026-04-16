package org.patron.proxy;

public interface ICuentaMitocode {
	CuentaMitocode retirarDinero(CuentaMitocode cuenta, double monto);
	CuentaMitocode depositarDinero(CuentaMitocode cuenta, double monto);
	void mostrarSaldo(CuentaMitocode cuenta);
}
