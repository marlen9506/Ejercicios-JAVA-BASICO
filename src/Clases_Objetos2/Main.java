package Clases_Objetos2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1=Integer.parseInt(JOptionPane.showInputDialog("Digita el número"));
		int numero2=Integer.parseInt(JOptionPane.showInputDialog("Digita el número"));
		
			//Crear mi objeto
		Operacion oper1=new Operacion();
		
		oper1.sumar(numero1,numero2); //con argumentos para la invocacion
		oper1.restar(numero1, numero2);
		oper1.multiplicacion(numero1, numero2);
		oper1.division(numero1, numero2);
		
		oper1.mostrarResultados();
	}

}
