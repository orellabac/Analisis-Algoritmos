
package Fibonnaci;
import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		System.out.println("Tecnologico de Costa Rica"+"\n"+"Analisis de Algoritmos"+"\n"+"Programaci�n Dinamica:Calculo de secuencia Fibbonaci");
    	System.out.println("Ingrese el numero del que quiere obtener el Fibbonaci: ");
    	String usuario = " ";
    	Scanner teclado = new Scanner(System.in);
    	usuario = teclado.nextLine();
    	
    	int obtenido = calcular_fibonnaci (Integer.parseInt(usuario));
    	
    	System.out.println("\n"+"\n"+"El fibonnaci correspondiente al numero "+" "+usuario +" "+ "es "+" "+obtenido);

	}
    public static int calcular_fibonnaci(int numero){
    	
    	
    	Arreglo Fibonnaci = new Arreglo();
    	Fibonnaci.insertar(new Numero(1));
    	Fibonnaci.insertar(new Numero(1));
    	
    	for (int i = 2; i<numero ;i++){
    		int nuevo_fibonnaci = Fibonnaci.seleccionar_elemento(i-1).getI()+Fibonnaci.seleccionar_elemento(i-2).getI();
    		Fibonnaci.insertar(new Numero(nuevo_fibonnaci));
    	}
    	return Fibonnaci.getUltimo().getI();
    }

}
