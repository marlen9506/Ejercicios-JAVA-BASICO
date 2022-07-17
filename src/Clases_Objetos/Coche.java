package Clases_Objetos;

public class Coche {
	//atributos
	
	String color;
	String marca;
	int km;
	
	//Metodos (acciones o comportamientos que va a realizar tu clase)
	
	public static void main(String[]args) {
		//crear objetos de mi clase Coche
		
		Coche coche1=new Coche(); //el objeto tiene todos los atributos
		
		//llenar los atributos
		coche1.color="Blanco";
		coche1.marca="Audio";
		coche1.km=0;
		
		//imprimirlos
		
		System.out.println("El color del coche1 es: "+ coche1.color);
		System.out.println("La marca del coche1 es: "+ coche1.marca);
		System.out.println("El kilometraje del coche es:"+ coche1.km);
		
		Coche coche2=new Coche();
		
		coche2.color="Rojo";
		coche2.marca="Ferrari";
		coche2.km=100;
		
		System.out.println("");
		System.out.println("El color del coche2 es: "+ coche2.color);
		System.out.println("La marca del coche2 es: "+ coche2.marca);
		System.out.println("El kilometraje del coche2 es:"+ coche2.km);
	}

}
