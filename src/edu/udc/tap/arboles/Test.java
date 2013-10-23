package edu.udc.tap.arboles;

import edu.udc.tap.arboles.grupo1.ArbolBinarioBusqueda;

public class Test {

	public static void main(String[] args) {
		
		Arbol arbol = new ArbolBinarioBusqueda();
		
		arbol.add(5);
		arbol.add(8);
		arbol.add(1);
		arbol.add(3);
		arbol.add(2);
		
		
		for (Object o:  arbol.recorrerInOrder()){
			System.out.println( o );
		}
		
		
		
	}
}
