package com.nada.pbkk;

public class Kelas extends Ruang {
	private String idkelas;
	
	public String getIdKelas() {
		return idkelas;
	}

	public Kelas(String idkelas, float tgruang, float lbruang, float pjruang, int idruang) {
		super(tgruang, lbruang, pjruang, idruang);
		this.idkelas = idkelas;
	}
}
