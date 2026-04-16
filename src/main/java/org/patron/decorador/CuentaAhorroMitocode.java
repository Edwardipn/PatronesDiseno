package org.patron.decorador;

public class CuentaAhorroMitocode implements ICuentaBancariaMitocode{

	@Override
	public void abrirCuenta(CuentaMitocode c) {
		System.out.println("==========================");
		System.out.println("Se abrió una cuenta de ahorro");
		System.out.println("Cliente: "+c.getCliente());	
		
	} 

}
