package edu.udc.tap.arboles;

import java.util.List;

public interface Arbol {

	public void add (Object data);
	public void remove (Object data);
	public List recorrerInOrder();
	public List recorrerPreOrder();
	public List recorrerPostOrder();
	
}
