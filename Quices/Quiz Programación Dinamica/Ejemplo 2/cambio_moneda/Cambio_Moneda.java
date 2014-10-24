/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambio_moneda;

import Objetos.Lista;
import Objetos.Moneda;
import java.util.Scanner;

/**
 *
 * @author LATITUDE
 */
public class Cambio_Moneda {
    	private static Scanner teclado;
	private static Scanner teclado1;

	public static void main(String[] args) {
		Lista o = new Lista();
		System.out.println("Tecnologico de Costa Rica"+"\n"+"Analisis de Algoritmos"+"\n"+"Programacion Dinamica:Problema de la moneda");
    	System.out.println("Ingrese cuantas combinaciones de monedas tiene: ");
    	String usuario = " ";
    	teclado = new Scanner(System.in);
    	usuario = teclado.nextLine();
    	int contador =0;
    	int ingresado = Integer.parseInt(usuario);
		while (contador < ingresado){
			System.out.println("Ingrese el valor de la moneda: ");
			teclado1 = new Scanner(System.in);
			String valor= teclado1.nextLine();
			o.insertar(new Moneda(Integer.parseInt(valor)));
			contador ++;
		}
    	
		System.out.print("�Cuanto es el vuelto que tiene que dar: "+" ");
		usuario = teclado.nextLine();
		Cambio x = new Cambio (Integer.parseInt(usuario),o);
		
		System.out.print("Segun el orden de los valores ingresados se muestra la cantidad que puede tomar por moneda");
		x.getCambio().imprimir();
		// TODO Auto-generated method stub

	}

    
}
