package org.patron.estructurales.decorador;

public abstract class CuentaDecoradorMitocode implements ICuentaBancariaMitocode {
	protected ICuentaBancariaMitocode cuentaDecorada;
	
	
	public CuentaDecoradorMitocode(ICuentaBancariaMitocode cuentaDecorada) {
		this.cuentaDecorada = cuentaDecorada;
	}


	@Override
	public void abrirCuenta(CuentaMitocode c) {
		this.cuentaDecorada.abrirCuenta(c);
	}

}
