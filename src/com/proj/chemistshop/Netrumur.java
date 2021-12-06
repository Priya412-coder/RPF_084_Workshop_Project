package com.proj.chemistshop;

public class Netrumur extends Medicine {
    public Netrumur() {
    	brand = "net";
    	composition = new String[5];
    	composition[0] = "ab";
    	composition[1] = "c2d";
    	composition[2] = "ef";
    	composition[3] = "123";
    	composition[4] = "154";
    	type = Medicine.Type.HOMOPATHY;

}
}
