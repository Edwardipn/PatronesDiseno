package org.patron.proxy;

import java.util.logging.Logger;

public class CuentaProxyMitocode implements ICuentaMitocode {
	private ICuentaMitocode cuentaReal;
	private final static Logger LOGGER = Logger.getLogger(CuentaProxyMitocode.class.getName()); 
	

	public CuentaProxyMitocode(ICuentaMitocode cuentaReal) {
		this.cuentaReal = cuentaReal;
	}

	@Override
	public CuentaMitocode retirarDinero(CuentaMitocode cuenta, double monto) {
		LOGGER.info("----Cuenta proxy - Retirar dinero----");
		if(cuentaReal == null) {
			cuentaReal = new CuentaBcoAMitocodeImpl();
			return cuentaReal.retirarDinero(cuenta, monto);
		}else {
			return cuentaReal.retirarDinero(cuenta, monto);
		}
	}

	@Override
	public CuentaMitocode depositarDinero(CuentaMitocode cuenta, double monto) {
		LOGGER.info("----Cuenta proxy - Depositar dinero----");
		if(cuentaReal == null) {
			cuentaReal = new CuentaBcoAMitocodeImpl();
			return cuentaReal.depositarDinero(cuenta, monto);
		}else {
			return cuentaReal.depositarDinero(cuenta, monto);
		}
	}

	@Override
	public void mostrarSaldo(CuentaMitocode cuenta) {
		LOGGER.info("----Cuenta proxy - Mostrar dinero----");
		if(cuentaReal == null) {
			cuentaReal = new CuentaBcoAMitocodeImpl();
			cuentaReal.mostrarSaldo(cuenta);
		}else {
			cuentaReal.mostrarSaldo(cuenta);
		}

	}

}
