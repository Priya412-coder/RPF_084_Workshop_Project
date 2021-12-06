package com.proj.chemistshop;

public class Acephen extends Medicine  {

    public Acephen() {
    	brand = "ace";
    	composition = new String[3];
    	composition[0] = "ab";
    	composition[1] = "cd";
    	composition[2] = "ef";
    	type = Medicine.Type.ALLOPATHY;
     }
}
