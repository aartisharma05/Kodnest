package com.kodnest.hasARelationship;

public class Mobile {
  String brand ="Realme";
  String color = "Blue";
  
  OS os = new OS();
  
  void port(Charger c) {
	  System.out.println(c.color + " " + c.brand + " " + c.output);
	  c.passElectricity();
  }
}
