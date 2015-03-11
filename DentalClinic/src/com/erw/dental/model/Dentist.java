package com.erw.dental.model;

public class Dentist extends Doctor {
	@Override
	public String toString() {
		return "Dentist name: "+this.getName()+"\n"+"Specialization : "+this.getSpecialization();
	}

}
