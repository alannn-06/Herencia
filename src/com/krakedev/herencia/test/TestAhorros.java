package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Paso 1: Padre
		Padre padre = new Padre("Roberto", 5, 2);
		padre.ahorrar(100.0);
		System.out.println("Padre (" + padre.getNombre() + ") total ahorrado: " + padre.getTotalAhorrado());

		// Paso 2: Hija
		Hija hija = new Hija(4, 1);
		hija.setNombre("Thais");
		hija.ahorrar(100.0);
		System.out.println("Hija (" + hija.getNombre() + ") total ahorrado: " + hija.getTotalAhorrado());

		// Paso 3: Hijo
		Hijo hijo = new Hijo("Alan", 5, 2, 8);
		hijo.ahorrar(100.0);
		System.out.println("Hijo (" + hijo.getNombre() + ") total ahorrado: " + hijo.getTotalAhorrado());
	}

}