package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Lista con los elementos de una orilla
 * Lista con los elementos de la otra orilla
 * Generación de indices aleatorios
 * Variable booleana para saber de que lado se encuentra
 */
public class Misioneros_Canibales {
	public static ArrayList <movimientos> mov=new ArrayList<movimientos>(); 
	public static ArrayList<estado> posibles= new ArrayList<estado>();

	
	public static estado estado_inicial;
	public static estado estado_final= new estado("MC",0,0);
	public static estado terminar = new estado("MC",0,0);
	public static String orilla = "I";
	static String mensaje = " ";
	static int contador;
	
	public  static void main (String [] args){
		
		
		posibles.add(new estado("MC",1,1));
		posibles.add(new estado("MM",0,2));
		posibles.add(new estado("CC",2,0));
		posibles.add(new estado("M",0,1));
		posibles.add(new estado("C",1,0));
		
		mov.add(new movimientos(estado_inicial,estado_final,contador,orilla,posibles));
		
		Scanner dato = new Scanner (System.in); //Creación de un objeto Scanner
		System.out.println("Ingrese la cantidad de canibales: ");
		String canibales = dato.nextLine();
		System.out.println("Ingrese la cantidad de misioneros: ");
		String misionero = dato.nextLine();
		estado_inicial =  new estado("MC",Integer.parseInt(canibales),Integer.parseInt(misionero));
		
		//imprimir();
		imprimir();
		bt();
		
	}
		
	
	
	private static void bt(){
		
		
		for (int i=contador;i<5;i++){
			if (!rechazar(posibles.get(i))){
				contador=i;
				accept(posibles.get(i));
				imprimir();
				break;
			}
		
		}
		
			
		
		if (contador == 6){
			eliminar_solucion();
			if (mov.size()==0){
				estado_inicial = terminar;
			}
		}
		
		while (estado_inicial != terminar){
			
			bt();
		}
	}
	
	private static void eliminar_solucion() {
		int posicion = (mov.size())-2;
		estado_inicial = mov.get(posicion).getInicio();
		estado_final = mov.get((posicion)).getFinalizacion();
		contador = mov.get(posicion).getContador_posiblesestados();
		orilla = mov.get(posicion).getOrilla();
		
		mov.remove(posicion+1);
		imprimir();
		
	}

	private static boolean rechazar(estado pendiente){
		if (orilla.equalsIgnoreCase("I")){
			if (pendiente.getMisioneros()>estado_inicial.getMisioneros() || pendiente.getCanibales()>estado_inicial.getCanibales()){
				return true;
			}
		}
		else{
			if (pendiente.getMisioneros()>estado_final.getMisioneros() || pendiente.getCanibales()>estado_final.getCanibales()){
				return true;
			}
			}
		
		int cant_total = calcular_canibales(pendiente.getCanibales());
		
		
		
		if (cant_total>estado_inicial.getMisioneros() || cant_total>estado_final.getMisioneros()){
			if (orilla.equals("I")&&estado_inicial.getCanibales()==0){
				return false;
			}
			if (orilla.equals("D")&&estado_final.getCanibales()==0){
				return false;
			}
			return true;
		}
		
		return false;
	}

	private static int calcular_canibales(int canibales) {
		if (orilla.equalsIgnoreCase("I")){
			return canibales + estado_final.getCanibales();
		}
		else{
			return canibales + estado_inicial.getCanibales();
		}}
	
	
	
	private static void accept(estado correcto){
		contador = 0;
		
		if (orilla.equalsIgnoreCase("I")){
			estado_inicial.setCanibales(estado_inicial.getCanibales()-correcto.getCanibales());
			
			estado_final.setCanibales(estado_final.getCanibales()+correcto.getCanibales());
			estado_inicial.setMisioneros(estado_inicial.getMisioneros()-correcto.getMisioneros());
			estado_final.setMisioneros(estado_final.getMisioneros()+correcto.getMisioneros());
			
			orilla= "D";
		}
		else{
			estado_inicial.setCanibales(estado_inicial.getCanibales()+correcto.getCanibales());
			estado_final.setCanibales(estado_final.getCanibales()-correcto.getCanibales());
			estado_inicial.setMisioneros(estado_inicial.getMisioneros()+correcto.getMisioneros());
			estado_final.setMisioneros(estado_final.getMisioneros()-correcto.getMisioneros());
			orilla= "I";
		}
		Collections.shuffle(posibles);
		mov.add(new movimientos(estado_inicial,estado_final,contador,orilla,posibles));
	}
	private static void imprimir(){
		System.out.println(mov.size()+" "+estado_inicial.getMisioneros()+"M"+estado_inicial.getCanibales()+"C"+"______________"+
				estado_final.getMisioneros()+"M"+estado_final.getCanibales()+"C"+orilla
				);
	}
	
	private static void crear_posibles(){
		
	}
}
