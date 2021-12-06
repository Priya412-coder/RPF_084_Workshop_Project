package com.proj.chemistshop;

public class Aspirin extends Medicine {
    public Aspirin() {
    	brand = "asp";
    	composition = new String[3];
    	composition[0] = "fg";
    	composition[1] = "gh";
    	composition[2] = "hi";
    	type = Medicine.Type.ALLOPATHY;
     }
}
