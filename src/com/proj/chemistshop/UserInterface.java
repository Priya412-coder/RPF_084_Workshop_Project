package com.proj.chemistshop;

import java.util.List;

public class UserInterface {
   public void printAllHomopathy(List<Medicine> list) {
	   for (int i = 0 ; i < list.size(); i++) {
		if(list.get(i).type == Medicine.Type.HOMOPATHY) {
		   System.out.println(list.get(i));
	   }
	   }
}
   public void printAllAllopathy(List<Medicine> list) {
	   for (int i = 0 ; i < list.size(); i++) {
		if(list.get(i).type == Medicine.Type.ALLOPATHY) {
		   System.out.println(list.get(i));
	   }
	   }
}
   public void printAllAyurvedic(List<Medicine> list) {
	   for (int i = 0 ; i < list.size(); i++) {
		if(list.get(i).type == Medicine.Type.AYURVEDIC) {
		   System.out.println(list.get(i));
	   }
	   }
}
   public void printAllUnani(List<Medicine> list) {
	   for (int i = 0 ; i < list.size(); i++) {
		if(list.get(i).type == Medicine.Type.UNANI) {
		   System.out.println(list.get(i));
	   }
	   }
}
   public void print(List<Medicine> list) {
	   for (int i = 0 ; i < list.size(); i++) {
		   System.out.println(list.get(i));
		}
   }
}
