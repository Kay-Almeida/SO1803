package view;

import controller.Ordenar;

public class Principal {
	public static void main(String[] args) {
		
		Ordenar ol = new Ordenar();
		
		int [] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int [] vetor2 = {44, 43, 42, 41, 40, 39, 38};
		int [] vetor3 = {31, 32, 33, 34, 99, 98, 97, 96};
			
		ol.metodo1(vetor1);
		ol.metodo1(vetor2);
		ol.metodo1(vetor3);
	}
	

}
