package org.patron.estructurales.decorador;

public class CuentaMitocode {
	private int id;
	private String Cliente;
	public CuentaMitocode() {
	}
	public CuentaMitocode(int id, String cliente) {
		this.id = id;
		Cliente = cliente;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCliente() {
		return Cliente;
	}
	public void setCliente(String cliente) {
		Cliente = cliente;
	}
	
}
