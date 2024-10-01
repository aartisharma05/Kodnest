package com.kodnest.dsa.searching;

//POJO Class
public class EmployeeFinding {
	
	public int id;
	public String name;
	
	public EmployeeFinding(int id, String name) {
		this.id = id;
		this.name = name;
	}

	static int EmployeeLinearSearch(EmployeeFinding ef[], String key) {
		
		
		for(int i = 0; i<= ef.length-1; i++) {
			if(key.equals(ef[i].name)) {
				return i;
			}
		}
		
		
		return -1;
		
	}

}
