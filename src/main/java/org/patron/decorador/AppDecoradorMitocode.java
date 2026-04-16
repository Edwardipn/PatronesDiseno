package org.patron.decorador;

public class AppDecoradorMitocode {

	public static void main(String[] args) {
		CuentaMitocode c = new CuentaMitocode(1,"Mito Code");
		ICuentaBancariaMitocode cuenta = new CuentaAhorroMitocode();
		ICuentaBancariaMitocode cuentaBlindada = new BlindajeDecoradorMitocode(cuenta);
		
		cuentaBlindada.abrirCuenta(c);
	}
}
