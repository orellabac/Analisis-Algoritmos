/*
 * Main.java
 *
 * Algoritmos_Geneticos Java application
 *
 * Created on 01-11-2014 11:3500 AM
 */
/*Se van a generar una serie de objetos y un peso inicial para la mochila, la población va a representar esa mochila.
 *El array de listaobjetos lo que pretende es que se mantenga algunos valores por defectos para que la nueva población
 *no se salga de lo posible, si el objeto creado no corresponde a ninguno en la lista se volverá a mutar.
 */

import java.util.*;
public class Main{
	public static ArrayList <Objeto> listaobjetos = new ArrayList<Objeto>();
    
	public static void generarObjetos(){
		Random rdm = new Random();

		listaobjetos.add(new Objeto("Lápiz",(int)Math.floor(Math.random()*500+1),new Individuo(0,0,0,1)));
		listaobjetos.add(new Objeto("Bloc de hojas",(int)Math.floor(Math.random()*500+1),new Individuo(0,0,1,0)));
		listaobjetos.add(new Objeto("Control remoto",(int)Math.floor(Math.random()*500+1),new Individuo(0,0,1,1)));
		listaobjetos.add(new Objeto("Libro 1",(int)Math.floor(Math.random()*500+1),new Individuo(0,1,0,0)));
		listaobjetos.add(new Objeto("Libro 2",(int)Math.floor(Math.random()*500+1),new Individuo(0,1,0,1)));
		listaobjetos.add(new Objeto("Libro 3",(int)Math.floor(Math.random()*500+1),new Individuo(0,1,1,0)));
		listaobjetos.add(new Objeto("Computadora",(int)Math.floor(Math.random()*500+1),new Individuo(0,1,1,1)));
		listaobjetos.add(new Objeto("Telefono",(int)Math.floor(Math.random()*500+1),new Individuo(1,0,0,0)));
		listaobjetos.add(new Objeto("Calculadora",(int)Math.floor(Math.random()*500+1),new Individuo(1,0,0,1)));
		listaobjetos.add(new Objeto("Camión",(int)Math.floor(Math.random()*500+1),new Individuo(1,0,1,0)));}
	
	public static void main(String[] args) {
		generarObjetos();
		int limite = 0;
	
		for (Objeto o:listaobjetos){
			if (o.getValor()>limite){
				limite=o.getValor();
			}
		}
	
		Algoritmo_Genetico prueba = new Algoritmo_Genetico(listaobjetos,10);
		int valor_mochila = 120;
		
		ArrayList <Individuo> enmochila = new ArrayList<Individuo>();
		
		for (int i=0;i<prueba.getPob().size();i++){
			int valor = prueba.getPob().getIndividuo(i).getFitness();
			int comprobar = valor_mochila - valor;
			if (comprobar >=0){
				valor_mochila = valor_mochila-valor;
				enmochila.add(prueba.getPob().getIndividuo(i));
				
			}
		}
		
		if (enmochila.isEmpty()){
			System.out.println("No se ha encontrado una generación posible");
		}
		else{
			int total_mochila = 0;
			for (Individuo mostrar : enmochila){
				for (Objeto valorar : listaobjetos){
					if (mostrar.getFitness()==valorar.getIndividuo().getFitness()){
						total_mochila = total_mochila + mostrar.getFitness();
						System.out.println("Puede llevar: " + " "+valorar.getNombre()+ "con un peso de:"+mostrar.getFitness()+" "+
					valorar.getValor()+".Con esto ha usado un total de "+" "+
								total_mochila + " "+ "del espacio de la mochila");
						break;
					}
				}
			}
		}
}
	
	
	}
