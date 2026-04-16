package org.patron.prototype;

public class CuentaMitocode implements ICuentaMitocade {
	private String tipo;
	private double monto;
	
	
	public CuentaMitocode() {
		this.tipo = "Ahorro";
	}


	public double getMonto() {
		return monto;
	}


	public void setMonto(double monto) {
		this.monto = monto;
	}


	@Override
	public ICuentaMitocade clonar() {
		CuentaMitocode cuenta =null;
		
			try {
				cuenta = (CuentaMitocode) clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return cuenta;
	}


	@Override
	public String toString() {
		return "CuentaMitocode [tipo=" + tipo + ", monto=" + monto + "]";
	}

}
