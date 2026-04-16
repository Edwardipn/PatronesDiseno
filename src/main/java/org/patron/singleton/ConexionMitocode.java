package org.patron.singleton;
//para comprender Singleton simularemos una conexion a BD 
/*
 *creacionales, se encargan de la inicializacion y configuracion de objetos
 *
 *estructurales, van a separar la interfaz de la implementacion 
 *van a ocuparse de las clases y de los objetos, 
 *como se pueden agrupar
 *como pueden formar estructuras más complejas, más grandes.
 *
 *comportamiento, en el cual van a describir a los objetos y clases que estan
 *implicados y como describir la comunicación entre ellos*/

public class ConexionMitocode {
	//Declaración
	private static ConexionMitocode instancia;
	
	private ConexionMitocode() {
		
	}
	public static ConexionMitocode getInstancia() {
		if(instancia==null) {
			instancia= new ConexionMitocode();
		}
		return instancia;
	}
	public void conectar() {
		System.out.println("Me conecté a la BD");
	}
	public void desconectar() {
		System.out.println("Me desconecté de la BD");
	}
	public static void main(String[] args) {
		//Instanciación por constructor, prohibido por ser "private"
		//osea, ConexionMitocode c = new ConexionMitocode(); no aplica
		ConexionMitocode c= ConexionMitocode.getInstancia();
		c.conectar();
		c.desconectar();
	}
}
