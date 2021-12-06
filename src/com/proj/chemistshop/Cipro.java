package com.proj.chemistshop;

public class Cipro extends Medicine {
    public Cipro() {
    	brand = "cip";
    	composition = new String[4];
    	composition[0] = "ij";
    	composition[1] = "kl";
    	composition[2] = "mn";
    	composition[3] = "no";
    	type = Medicine.Type.ALLOPATHY;
     }
}
