package Ejercicio2;
import java.util.Scanner;

public class Cuidadores {
   public void clase6(){	
	
	 Scanner s = new Scanner(System.in);
		
		int cui;
 	 
	 System.out.println("Ha ingresado a CUIDADORES 2.1");
		System.out.println("1. Elisa Aguilar");
		System.out.println("2. Juanito Alcachofa");
		System.out.println("3. Pedro Hern�ndez");
		
		System.out.println("Ingrese No. de cuidador que desea ver: ");
		cui = s.nextInt();
		
		switch(cui){
		case 1:{
			System.out.println("ELISA AGUILAR");
			System.out.println("Direcci�n: Zona 4");
			System.out.println("Tel�fono: 59019945");
			System.out.println("Fecha de inicio: 20/10/2009");
			System.out.println("Especies a su cargo: Peces, Aves");
			break;
			}
		case 2:{
			System.out.println("JUANITO ALCACHOFA");
			System.out.println("Direcci�n: Zona 2");
			System.out.println("Tel�fono: 558284863");
			System.out.println("Fecha de inicio: 04/12/2012");
			System.out.println("Especies a su cargo: Mam�feros");
			break;
			}
		case 3:{
			System.out.println("PEDRO HERN�NDEZ");
			System.out.println("Direcci�n: Zona 12");
			System.out.println("Tel�fono: 55989442");
			System.out.println("Fecha de inicio: 25/05/2010");
			System.out.println("Especies a su cargo: Reptiles");
			break;
			}
		

}
		}
}
