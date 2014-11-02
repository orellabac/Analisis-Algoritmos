/**
 * Fitness.java
 *
 * Created on 01-11-2014 05:12 PM
 *
 */

public class Fitness {
	
	public int getFitness(Individuo x){
		int valor =0;
		for (int i=0;i<=3;i++){
			int potencia = (int)Math.pow(2,i);
			if (x.getGen(i)==1){
				int convertir = x.getGen(i) * potencia;
				valor = valor+ convertir;
			}
		}
		return (int)Math.pow(valor,2);
	}
}
