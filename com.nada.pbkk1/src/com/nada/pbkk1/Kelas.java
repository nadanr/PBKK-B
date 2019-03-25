package com.nada.pbkk1;

public class Kelas extends Ruang {
	private String idkelas;
	
	public String getIdKelas() {
		return idkelas;
	}
	
	@Override
	public float getArea() {
		return tinggi*lebar;
	}

	public Kelas(String idkelas, float tgruang, float lbruang, float pjruang, int idruang) {
		super(tgruang, lbruang, pjruang, idruang);
		this.idkelas = idkelas;
	}
}

