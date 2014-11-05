/*
 * Main.java
 *
 * Algoritmos_Geneticos Java application
 *
 * Created on 01-11-2014 11:3500 AM
 */
/*Se van a generar una serie de objetos y un peso inicial para la mochila, la población va a representar esa mochila.
 *El array de listaobjetos lo que pretende es que se mantenga algunos valores por defectos para que la nueva población
 *no se salga de lo posible, si el objeto creado no corresponde a ninguno en la lista se volverá a mutar.
 */
/*
 * 
 */
import java.util.*;
public class Main{
	public static ArrayList <Objeto> listaobjetos = new ArrayList<Objeto>();
	public static Scanner teclado = new Scanner(System.in);
	public static void generarObjetos(){
		Random rdm = new Random();

		listaobjetos.add(new Objeto("Lápiz",(int)Math.floor(Math.random()*500+1),new Individuo(0,0,0,1)));
		listaobjetos.add(new Objeto("Bloc de hojas",(int)Math.floor(Math.random()*500+1),new Individuo(0,0,1,0)));
		listaobjetos.add(new Objeto("Control remoto",(int)Math.floor(Math.random()*500+1),new Individuo(0,0,1,1)));
		listaobjetos.add(new Objeto("Libro 1",(int)Math.floor(Math.random()*500+1),new Individuo(0,1,0,0)));
		listaobjetos.add(new Objeto("Libro 2",(int)Math.floor(Math.random()*500+1),new Individuo(0,1,0,1)));
		listaobjetos.add(new Objeto("Libro 3",(int)Math.floor(Math.random()*500+1),new Individuo(0,1,1,0)));
		listaobjetos.add(new Objeto("Computadora",(int)Math.floor(Math.random()*500+1),new Individuo(0,1,1,1)));
		listaobjetos.add(new Objeto("Telefono",(int)Math.floor(Math.random()*500+1),new Individuo(1,0,0,0)));
		listaobjetos.add(new Objeto("Calculadora",(int)Math.floor(Math.random()*500+1),new Individuo(1,0,0,1)));
		listaobjetos.add(new Objeto("Camión",(int)Math.floor(Math.random()*500+1),new Individuo(1,0,1,0)));
		}
	
	public static void main(String[] args) {
		boolean mostrar_menu=true;
		String usuario = " ";
		while (usuario ==" "){
		System.out.println("Algoritmos Geneticos: La idea de este programa es resolver el problema de la "
				+ "mochila mediante la utilización de algoritmos geneticos."+"\n"+ "Por lo tanto elegir"
						+ "algunas de las siguientes opciones"+"\n"+"\n"+"1.Trabajar con una población ya creada."
				+"\n"+"2Modificar la población ya existente"+"\n"+"3.Crear una nueva población");
			
			
			usuario = teclado.nextLine();
		}
		
		switch (usuario){
			case "1":
				generar_caso1();
				break;
			case "2":
				generar_caso2();
				break;
			case "3":
				generar_caso3();
				break;
		}
	
}
	private static void generar_caso3() {
		listaobjetos.removeAll(listaobjetos);
		int cant_objetos=0;
		int generaciones=3;
		int peso=0;
		
		System.out.println("Cuantos objetos va a llevar:  ");
		cant_objetos = Integer.parseInt(teclado.nextLine());
		for (int i=0;i<cant_objetos;i++){
			System.out.println("Nombre del objeto:  ");
			String nombre = (teclado.nextLine());
			System.out.println("Valor del objeto: ");
			int valor = Integer.parseInt(teclado.nextLine());
			Individuo nuevo = new Individuo();
			nuevo.generarIndividuo();
			System.out.println("El fitnnes sera de: "+ nuevo.getFitness());
			listaobjetos.add(new Objeto(nombre,valor,nuevo));
		}
		System.out.println("Cuantas generaciones desea:  ");
		generaciones = Integer.parseInt(teclado.nextLine());
		System.out.println("Cual va a ser el peso de la mochila  ");
		peso = Integer.parseInt(teclado.nextLine());
		
		
		iniciar_algoritmo(peso,generaciones);

		
	}

	public static void generar_caso1(){
		System.out.println("Su lista de objetos es la siguiente:"+"\n");
		System.out.println("Nombre"+"\t"+"\t"+"\tValor"+"\t"+"\t"+"\tFitness");
		generarObjetos();
		for (Objeto obj : listaobjetos){
			System.out.println(obj.getNombre()+"\t"+"\t"+"\t"+obj.getValor()+"\t"+"\t"+"\t"+obj.getIndividuo().getFitness());
		}
		System.out.println("La mochila soporta un peso de 120 :"+"\n");
		System.out.println("Genera 3 generaciones"+"\n");

		iniciar_algoritmo(120,3);
	}
	
	
	public static void generar_caso2(){
		int generaciones=3;
		boolean generar = false;
		int mochila = 120;
		while (generar==false){
		System.out.println("1.Cambiar el numero de generaciones"+"\n"+
		"2.Cambiar valor de la mochila"+"\n"+"3.Play");
		String usuario = " ";
		usuario = teclado.nextLine();
		switch (usuario){
		
		case "1":
			System.out.println("Cuantas generaciones desea: "+" ");
			usuario = teclado.nextLine();
			try{
			generaciones = Integer.parseInt(usuario);
			}
			catch(NumberFormatException e){
				System.out.println("Ingresé un número");
			}
			
			break;	
		case "2":
			System.out.println("De cuanto va a hacer el peso de la mochila: "+" ");
			usuario = teclado.nextLine();
			try{
			mochila = Integer.parseInt(usuario);
			}
			catch(NumberFormatException e){
				System.out.println("Ingresé un número");
			}
		case "3":
			iniciar_algoritmo(mochila,generaciones);
			generar=true;
			}
			
	}
		}

	private static void iniciar_algoritmo(int mochila,
			int generaciones) {
		Algoritmo_Genetico prueba = new Algoritmo_Genetico(listaobjetos,generaciones);
		
		int valor_mochila = mochila;
		
		ArrayList <Individuo> enmochila = new ArrayList<Individuo>();
		
		for (int i=0;i<prueba.getPob().size();i++){
			int valor = prueba.getPob().getIndividuo(i).getFitness();
			int comprobar = valor_mochila - valor;
			if (comprobar >=0){
				valor_mochila = valor_mochila-valor;
				enmochila.add(prueba.getPob().getIndividuo(i));
				
			}
		}
		
		if (enmochila.isEmpty()){
			System.out.println("No se ha encontrado una generación posible");
		}
		else{
			int total_mochila = 0;
			for (Individuo mostrar : enmochila){
				for (Objeto valorar : listaobjetos){
					if (mostrar.getFitness()==valorar.getIndividuo().getFitness()){
						total_mochila = total_mochila + mostrar.getFitness();
						System.out.println("Puede llevar: " + " "+valorar.getNombre()+ "con un peso de:"+mostrar.getFitness()+" "+
					valorar.getValor()+".Con esto ha usado un total de "+" "+
								total_mochila + " "+ "del espacio de la mochila");
						break;
					}
				}
			}
		}		
	}


	}
