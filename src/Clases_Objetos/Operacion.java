
package Clases_Objetos;
//SOLO SE CREARON ATRIBUTOS Y METODOS, PERO SE CREO UNA CLASE APARTE LLAMADA MAIN DONDE TENDRA LOS OBJETOS 
import javax.swing.JOptionPane;

public class Operacion {
	//Atributos
	int numero1; 
	int numero2;
	int suma;
	int resta;
	int multiplicacion;
	int division;
	
	
	//Metodos
	
	//M�todo para pedirle al usuario que no s digite 2 numeros
	
	public void leerNumeros() {
		
	numero1=Integer.parseInt(JOptionPane.showInputDialog("Digita el n�mero"));
	numero2=Integer.parseInt(JOptionPane.showInputDialog("Digita el n�mero"));
	
	}
	
	//M�todo para sumar ambos n�meros
	
	public void sumar() {
		suma=numero1+numero2;
	}
	//M�todo para sumar ambos n�meros
	
		public void restar() {
			resta=numero1-numero2;
	}
		//M�todo para multiplicacion ambos n�meros
		
		public void multiplicacion() {
			multiplicacion=numero1*numero2;
		}
		
		//M�todo para dividir ambos n�meros
		
		public void division() {
			division=numero1/numero2;
			
		}
		
		public void mostrarResultados() {
			System.out.println("La suma es: "+suma);
			System.out.println("La resta es: "+ resta);
			System.out.println("La multiplciacion es"+ multiplicacion);
			System.out.println("La division es: "+ division);
		}
		
}
