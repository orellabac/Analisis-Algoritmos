/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Objetos.Moneda;

/**
 *
 * @author LATITUDE
 */
public class Lista {
    private Moneda cabeza;
		private int tamaño;
		private Moneda ultimo;
		public Moneda getCabeza() {
			return cabeza;
		}
		public void setCabeza(Moneda cabeza) {
			this.cabeza = cabeza;
		}
		public int gettamaño() {
			return tamaño;
		}
		public void settamaño(int tamaño) {
			this.tamaño = tamaño;
		}
		public Moneda getUltimo() {
			return ultimo;
		}
		public void setUltimo(Moneda ultimo) {
			this.ultimo = ultimo;
		}
		public Lista() {
		
		}
		
		public void insertar(Moneda agregar){
			if (cabeza==null){
				cabeza=agregar;
				ultimo=agregar;
				tamaño ++;
			}
			else{
				ultimo.setSig(agregar);
				ultimo = agregar;
				tamaño ++;
			}
		}
		
		public void imprimir(){
			Moneda temp = cabeza;
			for (int i=0;i<tamaño;i++){
				System.out.print(temp.getI());
				temp = temp.getSig();
			}
				
		}
		
		public Moneda seleccionar_elemento(int i){
			int contador =0;
			Moneda retornar = cabeza;
			while (contador < tamaño){
				if (contador == i){
					return retornar;
				}
				else{
					contador ++;
					retornar = retornar.getSig();
				}
				
			}
			return null;
		}
                
                public void cambiar_contenido(Moneda nuevo,int ubicacion){
                   int contador=0;
                   Moneda reemplazar = cabeza;
                   while (contador <ubicacion){
                       reemplazar=reemplazar.getSig();
                       contador ++;
                    }
                   reemplazar.setI(nuevo.getI());
                }
}
