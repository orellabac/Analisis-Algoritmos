import java.util.ArrayList;


public class Algoritmo_Genetico {
	private Poblacion pob;
	private ArrayList<Integer>fitnnes_posible=new ArrayList<Integer>();
	private int peso_maximo;
	
	
	
	public Poblacion getPob() {
		return pob;
	}
	public void setPob(Poblacion pob) {
		this.pob = pob;
	}
	public ArrayList<Integer> getFitnnes_posible() {
		return fitnnes_posible;
	}
	public void setFitnnes_posible(ArrayList<Integer> fitnnes_posible) {
		this.fitnnes_posible = fitnnes_posible;
	}
	public int getPeso_maximo() {
		return peso_maximo;
	}
	public void setPeso_maximo(int peso_maximo) {
		this.peso_maximo = peso_maximo;
	}



	public Algoritmo_Genetico(ArrayList<Objeto>partida,int peso_maximo) {
		
			pob = new Poblacion(partida);
			for (int i=0;i<pob.size();i++){
				fitnnes_posible.add(pob.getIndividuo(i).getFitness());
			}
			Seleccion();
	}
	
	public void Seleccion(){
		//Como la idea es poder llevar más objetos se hara una selección por torneo.
		//Con la idea de poder llevar los objetos mas pesados..... Ya que se supone que estos
		//tiene un mayor valor
		for (int x=0;x<3;x++){
		Poblacion nueva = new Poblacion(pob.size(),false);
		for (int i=0;i<pob.size();i++){
			int ale1=(int)Math.floor(Math.random()*pob.size());
			int ale2=(int)Math.floor(Math.random()*pob.size());
			int ale3=(int)Math.floor(Math.random()*pob.size());
			nueva.guardarIndividuo(i, Torneo(pob.getIndividuo(ale1),pob.getIndividuo(ale2),pob.getIndividuo(ale3)));
		}
		CrucedeUnPunto(2, nueva);
		}
		}
	public Individuo Torneo(Individuo ind1,Individuo ind2,Individuo ind3){
		Individuo mayor = null;
		if (ind1.getFitness()>ind2.getFitness()){
			mayor=ind1;
		}
		else{
			if (ind2.getFitness()>ind3.getFitness()){
				mayor=ind2;
			}
			else{
				mayor=ind3;
			}
			
		}
		if (ind1.getFitness()<ind3.getFitness()){
			mayor=ind3;
		}
		
		return mayor;
	}
	public void CrucedeUnPunto(int punto,Poblacion temp){
		ArrayList<Individuo>cruce = new ArrayList<Individuo>();
		Individuo cruce1=null;
		Individuo cruce2=null;
		for(int i=0;i<=temp.size()/2;i=i+2){
			cruce1= pob.getIndividuo(i);
			cruce2=pob.getIndividuo(i+1);
			Individuo ind1=cruce1;
			Individuo ind2=cruce2;
			for (int y=punto;y>=0;y--){
				ind1.setGen(y, cruce2.getGen(y));
				ind2.setGen(y, cruce1.getGen(y));
			}
			for (Integer fit : fitnnes_posible){
				if (ind1.getFitness()==fit){
					cruce.add(ind1);
					break;
				}
		}
			for (Integer fit : fitnnes_posible){
				if (ind2.getFitness()==fit){
					cruce.add(ind2);
					break;
				}
		}
	
		}
	}
	

}
