/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author LATITUDE
 */
public class Moneda {
 private int i;
	private Moneda sig;
	private Moneda anterior;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public Moneda getSig() {
		return sig;
	}
	public void setSig(Moneda sig) {
		this.sig = sig;
	}
	public Moneda getAnterior() {
		return anterior;
	}
	public void setAnterior(Moneda anterior) {
		this.anterior = anterior;
	}
	public Moneda(int i) {
	
		this.i = i;
		
	
	}
}
