package Ejercicio2;

import java.util.Scanner;

import Ejercicio1.TransporteDePersonas;

public class Zoo {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	int zoo;
	
	System.out.println("APLICACI�N ZOO 2.0\n");
	System.out.println("1. ESPECIES");
	System.out.println("2. H�BITATS");
	System.out.println("3. ZONAS");
	System.out.println("4. ITINERARIOS");
	System.out.println("5. GUIAS");
	System.out.println("6. CUIDADORES");
	
	
	System.out.println("Ingrese el n�mero de lo que desea ver");
	zoo = s.nextInt();
		
	switch(zoo){
	case 1:{
		Especies app1 = new Especies();
		app1.clase1();
		break;
		//De la informaci�n acerca de las especies
							}
	case 2:{
		H�bitats app2 = new H�bitats();
		app2.clase2();
		//De la informaci�n acerca de los habitats
		break;
		
	}
	case 3:{
		Zonas app3 = new Zonas();
		app3.clase3();
		//De la informaci�n acerca de las zonas
		break;
		
	}
	case 4:{
		Itinerarios app4 = new Itinerarios();
		app4.clase4();
		//De la informaci�n acerca de los itinerarios
		break;
		
	}
	case 5:{
		Guias  app5 = new Guias();
		app5.clase5();
		//De la informaci�n acerca de los guias
		break;
		
	}

	case 6:{
		Cuidadores app6 = new Cuidadores();
		app6.clase6();
		//De la informaci�n acerca de los cuidadores
		break;
		
	}
	}

	}
}
