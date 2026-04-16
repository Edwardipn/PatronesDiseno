package org.patron.command;

public class DepositarMitocodeImpl implements IOperacionMitocode {

	private CuentaMitocode cuenta;
	private double monto;
	
	
	public DepositarMitocodeImpl(CuentaMitocode cuenta, double monto) {
		this.cuenta = cuenta;
		this.monto = monto;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.cuenta.depositar(this.monto);
	}

}
