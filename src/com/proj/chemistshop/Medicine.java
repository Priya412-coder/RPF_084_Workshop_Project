package com.proj.chemistshop;

import java.util.Arrays;
import java.util.Date;

public class Medicine {
	
	enum Type {
		HOMOPATHY,ALLOPATHY,AYURVEDIC,UNANI;
	}
	
	String brand;
	Type type;
	Date expiryDate;
	Date mfgDate;
	String[] composition;
	@Override
	public String toString() {
		return "Medicine [brand=" + brand + ", type=" + type + ", expiryDate=" + expiryDate + ", mfgDate=" + mfgDate
				+ ", composition=" + Arrays.toString(composition) + "]";
	}
}

