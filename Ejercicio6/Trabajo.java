package Ejercicio6;

import java.util.Scanner;

public class Trabajo {

	public static void main(String[] args) {
	//public void clase4(){

			Scanner s= new Scanner(System.in);
		
			int PrecioF = 30, iden, rep;
			
			System.out.println("APP MECANIC 2.0*\n");
			
			System.out.println("Ingrese el Identificador de trabajo");
			iden = s.nextInt();
			
			System.out.println("Tipo de Reparaci�n");
			System.out.println("1.- Reparaci�n Mec�nica");
			System.out.println("2.- Reparaci�n de chapa y pintura");
			System.out.println("3.- Revisi�n");
			System.out.println("Ingrese n�mero de reparaci�n realizada:");
			rep = s.nextInt();
			
	switch(rep){
	case 1:{
		RepMecanica op1 = new RepMecanica();
		op1.clase1(PrecioF);
		//De el precio del trabajo segun coste de material y horas trabajadas
		
		break;
	}
	case 2:{
		RepPintura op2 = new RepPintura();
		op2.clase2(PrecioF);
		//De el precio del trabajo segun coste de material y horas trabajadas
		
		break;
	}
	case 3:{
		Revision op3 = new Revision();
		op3.clase3(PrecioF);
		//De el precio del trabajo segun coste de material y horas trabajadas
		
		break;
	}
	
	}
			
		}

}
