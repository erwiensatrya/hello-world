package com.erw.dental.model;

public enum Specialization {
	ORTHODONTIST, PEDODONTIST;
	
	public String toString(){		
		switch(this){
		case ORTHODONTIST:
			return "Orthodontist";
	
		case PEDODONTIST:
			return "Pedodontist";
		default : return "unspecified";
		
		}
	}

}
