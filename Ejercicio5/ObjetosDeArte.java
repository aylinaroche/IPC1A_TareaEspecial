package Ejercicio5;

import java.util.Scanner;

public class ObjetosDeArte {

//	public static void main(String[] args) {
public void clase2(){
		 Scanner s = new Scanner(System.in);
		  int n, tipo, pert; 
		  System.out.println("OBJETOS DE ARTE\n");
		  System.out.println("Los objetos de arte se clasifican: ");
		  System.out.println("1.- TIPO");
		  System.out.println("2.- PERTENENCIA");
		  System.out.println("Seleccione que desea ver; ");
		  n = s.nextInt();
	
	switch (n){
	
	case 1:{
		System.out.println("TIPO");
		System.out.println("1. Pinturas");
		System.out.println("2. Esculturas");
		System.out.println("Ingrese n�mero:");
		tipo = s.nextInt();
		
		switch (tipo){
		
		case 1:{
			System.out.println("PINTURA");
			System.out.println("Tipo de Pintura");
			System.out.println("Soporte");
			System.out.println("Estilo\n");
			break;
		}
		
		case 2:{
			System.out.println("ESCULTURA");
			System.out.println("Material");
			System.out.println("Altura");
			System.out.println("Peso\n");
			break;
		}
		}break;
		
	}
	
	case 2: {
		System.out.println("PERTENENCIA");
		System.out.println("1. Objetos en pr�stamo");
		System.out.println("2. Objetos de colecci�n permanente");
		System.out.println("Ingrese n�mero:");
		pert = s.nextInt();
		
		switch (pert){
		
		case 1:{
			System.out.println("OBJETOS DE PR�STAMO");
			System.out.println("Nombre de colecci�n");
			System.out.println("Fecha de pr�stamo");
			System.out.println("Fecha de devoluci�n\n");
			break;
		}
		case 2: {
			System.out.println("OBJETOS PERMANENTES");
			System.out.println("Fecha de Adquisici�n: ");
			System.out.println("Ubicaci�n: \n");
			break;
		}
	
	}break;
		
	}
	
	}
	
	}
	
	

}
