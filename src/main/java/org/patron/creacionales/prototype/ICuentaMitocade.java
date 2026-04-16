package org.patron.creacionales.prototype;

public interface ICuentaMitocade extends Cloneable{
	/*Estoy estableciendo un m�todo clonar que va a devolver las misma interface
	 * �por qu�?
	 * porque si devuelve la misma interface se supone que puede haber clase que 
	 * implemente esta interfaz y cumpla con el objetivo de clonar
	 * */
	ICuentaMitocade clonar();
}
