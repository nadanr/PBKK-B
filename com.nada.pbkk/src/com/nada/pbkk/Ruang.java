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

}
