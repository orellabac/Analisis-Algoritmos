/**
 * Poblacion.java
 *
 * Created on 01-11-2014 06:04 PM
 *
 */

public class Poblacion {
	Individuo[] individuos;
	public Poblacion(int tamanoPoblacion,boolean inicializar){
		individuos = new Individuo [tamanoPoblacion];
		if (inicializar){
			for (int i=0;i<tamanoPoblacion;i++){
				Individuo nuevo = new Individuo();
				nuevo.generarIndividuo();
				guardarIndividuo(i,nuevo);
			}
		}
	}
	public Individuo getIndividuo(int index){
			return individuos[index];
	}
	public Individuo getFittest(){
		Individuo fittest = individuos[0];
		for (int i=0;i<size();i++){
			if (fittest.getFitness()<= getIndividuo(i).getFitness()){
				fittest=getIndividuo(i);
			}
		}
		return fittest;
	}
	public int size(){
		return individuos.length;
	}
	public void guardarIndividuo(int index,Individuo indiv){
		individuos[index] = indiv;
	}
}
