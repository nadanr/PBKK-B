package com.nada.pbkk1;

public abstract class Ruang {
	
	protected float tinggi, lebar, panjang;
	protected int id;
	
	public float getArea() {
		return panjang*lebar;
	}
	
	public float getVolume() {
		return tinggi*lebar*panjang;
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
