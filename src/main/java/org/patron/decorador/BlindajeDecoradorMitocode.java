package org.patron.decorador;

public class BlindajeDecoradorMitocode extends CuentaDecoradorMitocode{

	public BlindajeDecoradorMitocode(ICuentaBancariaMitocode cuentaDecorada) {
		super(cuentaDecorada);
	}

	@Override
	public void abrirCuenta(CuentaMitocode c) {
		cuentaDecorada.abrirCuenta(c);
		agregarBlindaje(c);
	}
	public void agregarBlindaje(CuentaMitocode c) {
		System.out.println("Se agregó blindaje a la cuenta del cliente "+c.getCliente());
	}
}
