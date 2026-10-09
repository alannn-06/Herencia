package com.krakedev.herencia;

public class Hijo extends Padre {
	private int juguetes;

	public Hijo(String nombre, int virtudes, int defectos, int juguetes) {
		super(nombre, virtudes, defectos);
		this.juguetes = juguetes;
	}

	public Hijo(int virtudes, int defectos, int juguetes) {
		super(virtudes, defectos);
		this.juguetes = juguetes;
	}

	public int getJuguetes() {
		return juguetes;
	}

	public void setJuguetes(int juguetes) {
		this.juguetes = juguetes;
	}

	@Override
	public void ahorrar(double monto) {
		super.ahorrar(monto * 0.5);
	}

	@Override
	public String toString() {
		return "Hijo [nombre=" + getNombre() + ", juguetes=" + juguetes + ", getDefectos()=" + getDefectos()
				+ ", getVirtudes()=" + getVirtudes() + ", getTotalAhorrado()=" + getTotalAhorrado() + "]";
	}
}