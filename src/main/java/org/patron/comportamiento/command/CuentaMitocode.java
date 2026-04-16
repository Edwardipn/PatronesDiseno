package org.patron.comportamiento.command;

public class CuentaMitocode {
	private int id;
	private double saldo;
	public CuentaMitocode(int id, double saldo) {
		this.id = id;
		this.saldo = saldo;
	}
	public void retirar(double monto) {
		this.saldo = this.saldo - monto;
		System.out.println("[COMANDO RETIRAR] Cuenta: " + id + ", saldo=" + this.saldo);
	}
	public void depositar(double monto) {
		this.saldo = this.saldo + monto;
		System.out.println("[COMANDO DEPOSITAR] Cuenta: " + id + ", saldo=" + this.saldo);
	}		
	
}
