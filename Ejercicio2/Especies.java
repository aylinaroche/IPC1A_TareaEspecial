package Ejercicio2;

import java.util.Scanner;

public class Especies {

	public void clase1(){
		Scanner s = new Scanner(System.in);
		
		int num, Mam, Av, Rep, Pec, Ins;
		
		System.out.println("Ha ingresado a ESPECIES 2.1");
	/*	System.out.println("1. Mam�feros");
		System.out.println("2. Aves");
		System.out.println("3. Reptiles");
		System.out.println("4. Peces");
		System.out.println("5. Insectos");
		
		System.out.println("Ingrese No. del grupo que desea ver;");
		num = s.nextInt();
		
		switch(num){
		case 1:{
		
		*/
			System.out.println("MAM�FEROS 2.0");
			System.out.println("1. Guepardo");
			System.out.println("2. Lobo");
			System.out.println("3. Le�n");
			System.out.println("4. Mono Ara�a");
			System.out.println("5. Elefante");
			
			System.out.println("Ingrese No. de mamifero que desea ver: ");
			Mam = s.nextInt();
			
			switch(Mam){
			case 1:{
				System.out.println("GUEPARDO 2.0");
				System.out.println("Nombre cient�fico: Acynonyx jubatus");
				System.out.println("Es un felino de gran tama�o que habita en la mayor parte de �frica y partes de Ir�n");
				break;
				}
			case 2:{
				System.out.println("LOBO 2.0");
				System.out.println("Nombre cient�fico: Canis lupus");
				System.out.println("Es una especie de mam�fero placentario del Orden de los carn�voros");
				break;
			}
			case 3:{
				System.out.println("LEON 2.0");
				System.out.println("Nombre cient�fico: Panthera leo");
				System.out.println("El le�n es uno de los cinco grandes felinos en el g�nero Panthera y un miembro de la familia Felidae");
				break;
				}
			case 4:{
				System.out.println("MONO ARA�A 2.0");
				System.out.println("Nombre cient�fico: Ateles geoffroyi");
				System.out.println("Es el nombre com�n de cualquiera de los primates del g�nero Ateles");
				break;
				}
			case 5:{
				System.out.println("ELEFANTE 2.0");
				System.out.println("Nombre cient�fico: Elephas maximus");
				System.out.println("Estos son los grandes mam�feros terrestres con un tronco y colmillos");
				break;
				}
				
				
									}
			
		
	}
	
	
}
