/*
 * Main.java
 *
 * Algoritmos_Geneticos Java application
 *
 * Created on 01-11-2014 11:36 AM
 */

public class Main{
    public static void main(String[] args) {
		
		Individuo prueba = new Individuo();
		prueba.generarIndividuo();
		for (int i=3;i>-1;i--){
			System.out.print(prueba.getGen(i));
		}
		Fitness x = new Fitness();
		
		System.out.print(x.getFitness(prueba));
    }
}