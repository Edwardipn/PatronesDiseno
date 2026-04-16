package org.patron.decorador;

public class CuentaCorrienteMitocode implements ICuentaBancariaMitocode{

	@Override
	public void abrirCuenta(CuentaMitocode c) {
		System.out.println("==========================");
		System.out.println("Se abrió una cuenta corriente");
		System.out.println("Cliente: "+c.getCliente());	
	}
}
