package org.patron.estructurales.proxy;

public class AppMitocode {

	public static void main(String[] args) {
		CuentaMitocode c = new CuentaMitocode(1, "Edward", 50000);
		
		ICuentaMitocode cuentaProxy = new CuentaProxyMitocode(new CuentaBcoAMitocodeImpl());
		cuentaProxy.mostrarSaldo(c);
		c = cuentaProxy.depositarDinero(c, 500);
		c = cuentaProxy.retirarDinero(c, 450);
		cuentaProxy.mostrarSaldo(c);
	}

}
