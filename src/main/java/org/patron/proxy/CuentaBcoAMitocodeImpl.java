package org.patron.proxy;

public class CuentaBcoAMitocodeImpl implements ICuentaMitocode{
	
	@Override
	public CuentaMitocode retirarDinero(CuentaMitocode cuenta, double monto) {
		double saldoActual = cuenta.getSaldoInicial() - monto;
		cuenta.setSaldoInicial(saldoActual);
		System.out.println("Saldo actual: "+cuenta.getSaldoInicial());
		return cuenta;
	}

	@Override
	public CuentaMitocode depositarDinero(CuentaMitocode cuenta, double monto) {
		double saldoActual = cuenta.getSaldoInicial() + monto;
		cuenta.setSaldoInicial(saldoActual);
		System.out.println("Saldo actual: "+cuenta.getSaldoInicial());
		return cuenta;
	}

	@Override
	public void mostrarSaldo(CuentaMitocode cuenta) {
		System.out.println("Saldo actual: "+cuenta.getSaldoInicial());
		
	}
	
}
