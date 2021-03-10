package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	List<String> parole; 
		
	public Parole() {
		//this.parole = new ArrayList<String>(); 
		this.parole = new LinkedList<String>();
	}
	
	public void addParola(String p) {
		if(parole.contains(p)==false)
			parole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(parole);	//	Senza comparatore ordina alfabeticamente
		return parole;
	}
	
	public void reset() {
		parole.removeAll(parole);	//	Svuota la lista
	}

	public void delete(String p) {
		parole.remove(p);
	}

	@Override
	public String toString() {
		String risultato = "";
		for(String s : getElenco())
			risultato += s +"\n";
		
		return risultato;
	}
	
}
