package Ejercicio2;

import java.util.Scanner;

public class H�bitats {

//	public static void main(String[] args) {
 public void clase2(){
	 Scanner s = new Scanner(System.in);
		
		int hab;
	 
	 
	 System.out.println("Ha ingresado a H�BITATS 2.1");
		System.out.println("1. Bosque");
		System.out.println("2. Desierto");
		System.out.println("3. Monta�a");
		System.out.println("4. R�o");
		System.out.println("5. Pantano");
		
		System.out.println("Ingrese No. de h�bitat que desea ver: ");
		hab = s.nextInt();
		
		switch(hab){
		case 1:{
			System.out.println("BOSQUE");
			System.out.println("Clima: Templado, Tropical, Subtropical");
			System.out.println("Vegetaci�n: Bosque de frondosa, con�feras y mixto ");
			System.out.println("Continentes: Asia, Ocean�a, �frica, Am�rica, Europa");
			break;
			}
		case 2:{
			System.out.println("DESIERTO");
			System.out.println("Clima: Caluroso  ");
			System.out.println("Vegetaci�n: plantas espinosas, como los cactus y matorrales");
			System.out.println("Continentes: �frica");
			break;
		}
		case 3:{
			System.out.println("MONTA�A");
			System.out.println("Clima: Templado, h�medo");
			System.out.println("Vegetaci�n: Praderas");
			System.out.println("Continentes:  Am�rica");
			break;
			}
		case 4:{
			System.out.println("RIO");
		    System.out.println("Clima: Fr�o, h�medo");
		    System.out.println("Vegetaci�n: Algas");
		    System.out.println("Continentes: Am�rica, As�a, Ocean�a ");
			break;
			}
		case 5:{
			System.out.println("Pantano");
			System.out.println("Clima: H�medo");
			System.out.println("Vegetaci�n: Algas, Valles");
			System.out.println("Continentes: �frica, Europa, Asia");
			break;
			}
			
			
								}
		

		
		
		
		
		
	}

}
