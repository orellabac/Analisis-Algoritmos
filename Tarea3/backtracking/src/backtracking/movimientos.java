package backtracking;

import java.util.ArrayList;

public class movimientos {
	private estado inicio;
	private estado finalizacion;
	private int contador_posiblesestados;
	private String orilla;
	private ArrayList<estado> aleatorio = new ArrayList<estado>();
	
	
	
	public estado getInicio() {
		return inicio;
	}
	public void setInicio(estado inicio) {
		this.inicio = inicio;
	}
	public estado getFinalizacion() {
		return finalizacion;
	}
	public void setFinalizacion(estado finalizacion) {
		this.finalizacion = finalizacion;
	}
	public int getContador_posiblesestados() {
		return contador_posiblesestados;
	}
	public void setContador_posiblesestados(int contador_posiblesestados) {
		this.contador_posiblesestados = contador_posiblesestados;
	}
	public String getOrilla() {
		return orilla;
	}
	public void setOrilla(String orilla) {
		this.orilla = orilla;
	}
	public movimientos(estado inicio, estado finalizacion,
			int contador_posiblesestados, String orilla, ArrayList <estado> al) {
		
		this.inicio = inicio;
		this.finalizacion = finalizacion;
		this.contador_posiblesestados = contador_posiblesestados;
		this.orilla = orilla;
		this.aleatorio=al;
	}
	public ArrayList<estado> getAleatorio() {
		return aleatorio;
	}
	public void setAleatorio(ArrayList<estado> aleatorio) {
		this.aleatorio = aleatorio;
	}
	
	
	
	
}
