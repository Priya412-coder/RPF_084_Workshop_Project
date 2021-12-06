package com.proj.chemistshop;

import java.util.Date;

public class Disprin extends Medicine {
    public Disprin() {
   	brand = "Dis";
   	composition = new String[2];
   	composition[0] = "para";
   	composition[1] = "caff";
	type = Medicine.Type.ALLOPATHY;
    }
}
