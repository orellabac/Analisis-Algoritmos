/**
 * Individuo.java
 *
 * Created on 01-11-2014 04:29 PM
 *
 */
import java.util.*;

public class Individuo {
    static int largoPorDefecto = 4;
    private byte [] genes = new byte[largoPorDefecto];
    private int fitness = 0;
    
    //crear un individuo aleatorio
    public void generarIndividuo(){
        Random rg = new Random();
        for(int i =0; i < largoPorDefecto; i++){
            byte gene = (byte) rg.nextInt(2);
            genes[i] = gene;
        }
	}
    public void setLargoPorDefecto(int lenght){
					largoPorDefecto=lenght;
	}
	public byte getGen(int index){
		return genes[index];
	}
	public void setGen(int index,byte value){
		genes[index]=value;
		fitness=0;
	}
	public int size(){
		return genes.length;
	}
	public int getFitness(){
		Fitness x = new Fitness();
		return x.getFitness(this);
	}
	
	public String toString(){
		String geneString="";
		for (int i=0;i<size();i++){
			geneString +=getGen(i);
		}
		return geneString;
	}
	}
	
	
	
	

