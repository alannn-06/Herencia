package com.krakedev.herencia;

public class Padre {
	private String nombre;
	private int defectos;
	private int virtudes;
	private double totalAhorrado;

	public Padre() {
	}

	public Padre(String nombre, int virtudes, int defectos) {
		this.nombre = nombre;
		this.virtudes = virtudes;
		this.defectos = defectos;
	}

	public Padre(int virtudes, int defectos) {
		this.virtudes = virtudes;
		this.defectos = defectos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDefectos() {
		return defectos;
	}

	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}

	public int getVirtudes() {
		return virtudes;
	}

	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}

	public double getTotalAhorrado() {
		return totalAhorrado;
	}

	public void setTotalAhorrado(double totalAhorrado) {
		this.totalAhorrado = totalAhorrado;
	}

	public void ahorrar(double monto) {
		totalAhorrado += monto;
	}

	@Override
	public String toString() {
		return "Padre [nombre=" + nombre + ", defectos=" + defectos + ", virtudes=" + virtudes + ", totalAhorrado="
				+ totalAhorrado + "]";
	}
}