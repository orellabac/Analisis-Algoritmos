package Fibonnaci;



public class Arreglo {
	
		private Numero cabeza;
		private int tamaño;
		private Numero ultimo;
		public Numero getCabeza() {
			return cabeza;
		}
		public void setCabeza(Numero cabeza) {
			this.cabeza = cabeza;
		}
		public int getTamaño() {
			return tamaño;
		}
		public void setTamaño(int tamaño) {
			this.tamaño = tamaño;
		}
		public Numero getUltimo() {
			return ultimo;
		}
		public void setUltimo(Numero ultimo) {
			this.ultimo = ultimo;
		}
		public Arreglo() {
		
		}
		
		public void insertar(Numero agregar){
			if (cabeza==null){
				cabeza=agregar;
				ultimo=agregar;
				tamaño ++;
			}
			else{
				ultimo.setSig(agregar);
				ultimo = agregar;
				tamaño ++;
			}
		}
		
		public void imprimir(){
			Numero temp = cabeza;
			for (int i=0;i<tamaño;i++){
				System.out.print(temp.getI());
				temp = temp.getSig();
			}
				
		}
		
		public Numero seleccionar_elemento(int i){
			int contador =0;
			Numero retornar = cabeza;
			while (contador < tamaño){
				if (contador == i){
					return retornar;
				}
				else{
					contador ++;
					retornar = retornar.getSig();
				}
				
			}
			return null;
		}
		
		
	}


