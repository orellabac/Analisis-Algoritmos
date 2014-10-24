package cambio_moneda;

import Objetos.Moneda;
import Objetos.Lista;
import Objetos.*;
public class Cambio {
	private int[][] tabla;
	private Lista Monedero;
	private Lista Cambio;
	private int vuelto;
	
	
	
	
	

	public Lista getMonedero() {
		return Monedero;
	}

	public void setMonedero(Lista monedero) {
		Monedero = monedero;
	}

	public Lista getCambio() {
		return Cambio;
	}

	public void setCambio(Lista cambio) {
		Cambio = cambio;
	}

	public int getVuelto() {
		return vuelto;
	}

	public void setVuelto(int vuelto) {
		this.vuelto = vuelto;
	}




	public Cambio(int vuelto,Lista monedero) {
		this.vuelto=vuelto;
		this.Monedero=monedero;
		
		tabla = new int[Monedero.gettamaño()+1][vuelto+1];
		
		
		this.calcular_moneda(monedero.gettamaño(),vuelto);
		this.seleccionar_moneda();
	}
	
	public void calcular_moneda(int fila,int columna){
        for (int i = 0; i <fila-1; i++)
            tabla[i][0] = 0;

        for (int j = 1; j <= columna-1; j++)
            tabla[0][j] = 99;
		
		for (int i=1;i<fila-1;i++){
			for (int j=1;j<columna-1;j++){
				if (j<Monedero.seleccionar_elemento(i-1).getI()){

                    tabla[i][j] = tabla[i - 1][j];
				}
				else{
					int x = Monedero.seleccionar_elemento(i-1).getI();
					int minimo = calcular_minimo(tabla[i - 1][j] , tabla[i][(j- x) + 1]);
					tabla[i][j] = minimo;
					
				}
				
			}
		}
	}
	private void seleccionar_moneda(){
		int i,j;
		Cambio = new Lista();
		for (i=0;i<this.Monedero.gettamaño()-1;i++){
			Cambio.insertar(new Moneda(0));
		}
		i=Monedero.gettamaño();
		j=vuelto;
		while (j>0){
			if(i>1 && tabla[i][j]==tabla[i-1][j]){
				i--;
			}
			else{
				int aumentar = Cambio.seleccionar_elemento(i-1).getI();
				Cambio.cambiar_contenido(new Moneda(aumentar+1),i-1);
				j= j-Monedero.seleccionar_elemento(i-1).getI();
			}
		}
	}
	private int calcular_minimo(int numero1,int numero2){
		if (numero1<numero2){
			return numero1;
		}
		else{
			return numero2;
		}
	}

}
