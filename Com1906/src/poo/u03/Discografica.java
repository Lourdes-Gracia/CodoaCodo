package poo.u03;

import java.util.ArrayList;
import java.util.Iterator;

import poo.u02.DiscoMusical;

public class Discografica {
	// private DiscoMusical[] discografia;
	private ArrayList<DiscoMusical> discografia;
	private String nombre;
	private int anioCreacion;
	private int cont;
	
	public Discografica(int tam, String nombre) {
		discografia = new ArrayList<DiscoMusical>(tam);
		this.nombre = nombre;
		cont = 0;
	}
	
	public boolean agregarDisco(DiscoMusical disco) {
		// Codigo del m�todo
		return discografia.add(disco);
			// cont++;
			// return true;
	}
	
	public String toString() {
		Iterator<DiscoMusical> it = discografia.iterator();
		
		String texto = "";
		DiscoMusical disco;
		// Codigo del m�todo
		/*
		for (int i = 0; i < cont; i++) {
			disco = discografia.get(i);
			texto += disco.toString() + "\n";
		}
		*/
		/*for (DiscoMusical discoMusical : discografia) {
			texto += discoMusical.toString() + "\n";
		}
		*/
		while (it.hasNext()) {
			disco = it.next();
			texto += disco.toString() + "\n";
		}
		return texto;
	}
	
	public DiscoMusical buscar(String autor) { 
		// C�digo 
		return null;
	}
	
	public DiscoMusical buscar(String titulo, String autor, int anioEdicion) { 
		// C�digo 
		return null;
	}
	
	public boolean existe(DiscoMusical disco) { 
		// C�digo 
		return false;
	}
	
	public int buscar(DiscoMusical disco) { 
		// C�digo 
		return discografia.indexOf(disco);
	}
	
}
