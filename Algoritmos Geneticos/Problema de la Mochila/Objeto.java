/**
 * Objeto.java
 *
 * Created on 03-11-2014 09:15 AM
 *
 */

public class Objeto {
	private Individuo genes;    
	private int valor =0;
	private String nombre;
	
	public void setIndividuo(Individuo ind){
		genes=ind;
	}
	public Individuo getIndividuo (){
		return genes;
	}
	
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setValor(int x){
		valor=x;
	}
	public String getNombre(){
		return nombre;
	}
	public int getValor(){
		return valor;
	}
	public Objeto(String nombre, int valor, Individuo x){
		this.nombre=nombre;
		this.valor=valor;
		this.genes=x;
	}
	
}
