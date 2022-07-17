package Clases_Objetos2;

import javax.swing.JOptionPane;

public class Operacion {
	
		//Atributos
	
		int suma;
		int resta;
		int multiplicacion;
		int division;
		
		
	
		//Método para sumar ambos números
		
		public void sumar(int numero1,int numero2 ) { //Colocar parametros para la declaracion
		suma=numero1+numero2;
		}
		//Método para sumar ambos números
		
			public void restar(int numero1,int numero2) {
			resta=numero1-numero2;
		}
			//Método para multiplicacion ambos números
			
			public void multiplicacion(int numero1,int numero2) { //
				multiplicacion=numero1*numero2;
			}
			
			//Método para dividir ambos números
			
			public void division(int numero1,int numero2) {
				division=numero1/numero2;
				
			}
			
			public void mostrarResultados() {
				System.out.println("La suma es: "+suma);
				System.out.println("La resta es: "+ resta);
				System.out.println("La multiplciacion es"+ multiplicacion);
				System.out.println("La division es: "+ division);
			}
			
	}

