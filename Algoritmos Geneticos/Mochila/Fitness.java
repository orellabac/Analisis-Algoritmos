/**
 * Fitness.java
 *
 * Created on 01-11-2014 05:12 PM
 *
 */

public class Fitness {
	
	public int getFitness(Individuo x){
		int valor =0;
		int potencia = 1;
		
		for (int i=0;i<4;i++){
			valor = valor+(x.getGen(i) * (potencia));
			potencia = potencia^2;
		}
		return valor;
	}
}
