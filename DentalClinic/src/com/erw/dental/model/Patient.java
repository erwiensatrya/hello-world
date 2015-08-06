package com.erw.dental.model;

import java.util.Date;
import java.util.List;

public class Patient {

	private String name;
	private Date birthdate;
	private int age;
	private char gender;
	private String address;
	private String city;
	private List<MedicalRecord> medRecordList;
	
	public void registerPatient(){
		//call SQL insert method 
	}
	
	
}
