package com.nada.pbkk1;

public class Lab extends Ruang {

	public String idlab;
	
	public String getIdLab() {
		return idlab;
	}
	
	public Lab(String idlab, float tgruang, float lbruang, float pjruang, int idruang) {
		super(tgruang, lbruang, pjruang, idruang);
		this.idlab = idlab;
	}

}
