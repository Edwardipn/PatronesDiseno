package org.patron.creacionales.prototype;

public class AppPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaMitocode cuentaAhorro = new CuentaMitocode();
		cuentaAhorro.setMonto(200);
		CuentaMitocode cuentaCredito = new CuentaMitocode();
		CuentaMitocode cuentaClon = /*new CuentaMitocode();*/(CuentaMitocode) cuentaAhorro.clonar();
		
		System.out.println(cuentaAhorro);
		System.out.println(cuentaCredito);
		System.out.println(cuentaClon);
		
		if(cuentaClon != null) {
			System.out.println(cuentaClon);
		}
		System.out.println(cuentaClon == cuentaAhorro);
		System.exit(0);
	}

}
