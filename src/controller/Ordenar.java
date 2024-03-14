package controller;

import algoritmo.Ordenadores;

public class Ordenar {
	public Ordenar () {
		super(); 
	}
	
	public void metodo1(int [] vetor ) {
		Ordenadores od = new Ordenadores(); 
		od.quick(vetor, 0, vetor.length -1);
		
		System.out.println("Vetor ordenado por QuickSort");
		for(int valor : vetor) {	
		System.out.print(valor+ " ");
		}
		System.out.println(" ");
	}
	
	
}
