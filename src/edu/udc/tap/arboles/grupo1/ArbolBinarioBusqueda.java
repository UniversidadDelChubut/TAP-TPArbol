package edu.udc.tap.arboles.grupo1;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import edu.udc.tap.arboles.Arbol;

public class ArbolBinarioBusqueda implements Arbol {
	
	private Nodo raiz;
	
	public ArbolBinarioBusqueda(){
		
	}
	
	@Override
	public void add(Object data) {
		// TODO Auto-generated method stub	
	}
	
	@Override
	public void remove(Object data) {
		// TODO Auto-generated method stub
		
	}
	
	public List recorrerInOrder() {
		List lista = new LinkedList();
		recorrerInOrder(this.raiz, lista);
		return lista;
	}
	
	private void recorrerInOrder(Nodo nodo , List resultado){
		if (nodo == null) 
			return;
		this.recorrerInOrder(nodo.getHijoIzquierdo(), resultado);
		resultado.add(nodo.getData());
		this.recorrerInOrder(nodo.getHijoDerecho(), resultado);
	}
	
	@Override
	public List recorrerPostOrder() {
		return null;
	}
	
	@Override
	public List recorrerPreOrder() {
		return null;
	}
	
	private int comparar (Object o1, Object o2){
		if (o1 instanceof Comparable && o2 instanceof Comparable ){
			return ((Comparable)o1).compareTo(o2);
		}
		return 1;
	}
		
	private class Nodo {
		
		private final Object data;
		private Nodo hijoIzquierdo;
		private Nodo hijoDerecho;

		
		public Nodo(Object data) {
			this.data = data;
		}

		
		public Object getData() {
			return data;
		}
		
		public Nodo getHijoDerecho() {
			return hijoDerecho;
		}
		
		public Nodo getHijoIzquierdo() {
			return hijoIzquierdo;
		}
		
		public void setHijoDerecho(Nodo hijoDerecho) {
			this.hijoDerecho = hijoDerecho;
		}
		
		public void setHijoIzquierdo(Nodo hijoIzquierdo) {
			this.hijoIzquierdo = hijoIzquierdo;
		}
		
	}
}
