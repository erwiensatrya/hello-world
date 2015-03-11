package com.erw.dental;

import javax.annotation.processing.Processor;

import com.erw.dental.model.Dentist;
import com.erw.dental.model.Doctor;
import com.erw.dental.model.Specialization;

public class ClinicMain {

	static Doctor d;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d = new Dentist();
		d.setName("Erwin");
		d.setSpecialization(Specialization.PEDODONTIST);
		System.out.println(d.toString());
				
	}

}
