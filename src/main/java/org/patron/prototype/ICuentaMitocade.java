package org.patron.prototype;

public interface ICuentaMitocade extends Cloneable{
	/*Estoy estableciendo un método clonar que va a devolver las misma interface
	 * ¿por qué?
	 * porque si devuelve la misma interface se supone que puede haber clase que 
	 * implemente esta interfaz y cumpla con el objetivo de clonar
	 * */
	ICuentaMitocade clonar();
}
