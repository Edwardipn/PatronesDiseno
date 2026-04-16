package org.patron.comportamiento.command;

public class RetirarMitocodeImpl implements IOperacionMitocode {
	private CuentaMitocode cuenta;
	private double monto;
	
	
	public RetirarMitocodeImpl(CuentaMitocode cuenta, double monto) {
		this.cuenta = cuenta;
		this.monto = monto;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.cuenta.retirar(this.monto);
	}

}
