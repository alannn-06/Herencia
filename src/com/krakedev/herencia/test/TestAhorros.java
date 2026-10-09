package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Padre padre = new Padre(5, 2);
		padre.ahorrar(100.0);
		System.out.println("Padre total ahorrado: " + padre.getTotalAhorrado());

		Hija hija = new Hija(4, 1);
		hija.ahorrar(100.0);
		System.out.println("Hija total ahorrado: " + hija.getTotalAhorrado());

		Hijo hijo = new Hijo(5, 2, 8);
		hijo.ahorrar(100.0);
		System.out.println("Hijo total ahorrado: " + hijo.getTotalAhorrado());
	}

}