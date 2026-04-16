package org.patron.estructurales.decorador;

public class CuentaCorrienteMitocode implements ICuentaBancariaMitocode{

	@Override
	public void abrirCuenta(CuentaMitocode c) {
		System.out.println("==========================");
		System.out.println("Se abri� una cuenta corriente");
		System.out.println("Cliente: "+c.getCliente());	
	}
}
