package com.proj.chemistshop;

public class Crocin extends Medicine {

     public Crocin() {
    	brand = "GSK";
    	composition = new String[3];
    	composition[0] = "paracitamol";
    	composition[1] = "caffeine";
    	composition[2] = "analgesic";
    	type = Medicine.Type.ALLOPATHY;
     }

}
