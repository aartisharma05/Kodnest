package com.kodnest.hasARelationship;

public class MobileApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Mobile phone = new Mobile();
    
    System.out.println("Mobile Name: " + phone.brand);
    System.out.println("Mobile Color: " + phone.color);
    
    System.out.println("++++++++++++++++++++++++++++++++++++++");
    
    Charger charger = new Charger();
    System.out.println("Charger Color: " + charger.color);
    System.out.println("Charger Brand: " + charger.brand);
    System.out.println("Charger Output: " + charger.output);

    System.out.println("++++++++++++++++++++++++++++++++++++++");
    
    phone.port(charger);
    
    phone = null;
    
    System.out.println("Phone destroyed");
    System.out.println(phone.os.name);
    System.out.println(phone.os.version);
    
    System.out.println(charger.color + " " +  charger.brand + " " + charger.output );
    
    
	}

}


// Mobile Name: Realme
// Mobile Color: Blue
// ++++++++++++++++++++++++++++++++++++++
// Charger Color: White
// Charger Brand: MI
// Charger Output: 20
// ++++++++++++++++++++++++++++++++++++++
// White MI 20
// Charger is passing the electricity and charging the device
// Phone destroyed
// Exception in thread "main" java.lang.NullPointerException: Cannot read field "os" because "phone" is null
// 	at com.kodnest.hasARelationship.MobileApp.main(MobileApp.java:26)
