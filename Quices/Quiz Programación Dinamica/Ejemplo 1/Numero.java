package Fibonnaci;



public class Numero {
	private int i;
	private Numero sig;
	private Numero anterior;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public Numero getSig() {
		return sig;
	}
	public void setSig(Numero sig) {
		this.sig = sig;
	}
	public Numero getAnterior() {
		return anterior;
	}
	public void setAnterior(Numero anterior) {
		this.anterior = anterior;
	}
	public Numero(int i) {
	
		this.i = i;
		
	
	}
}
