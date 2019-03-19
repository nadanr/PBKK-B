package com.nada.pbkk;

public abstract class Ruang {

	protected float tinggi, lebar, panjang;
	protected int id;
	
	public float getArea() {
		return tinggi*lebar;
	}
	
	public int getRuangId() {
		return id;
	}

	public Ruang(float tinggi, float lebar, float panjang, int id) {
		super();
		this.tinggi = tinggi;
		this.lebar = lebar;
		this.panjang = panjang;
		this.id = id;
	}
	
	

}
