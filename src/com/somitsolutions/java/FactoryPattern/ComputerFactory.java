package com.somitsolutions.java.FactoryPattern;

public class ComputerFactory {
	
	private static ComputerFactory instance;
	
	private ComputerFactory() {
		
	}
	
	public static ComputerFactory getFactory() {
		if(instance == null) {
		instance = new ComputerFactory();
			}
		return instance;
	}
	
	public Computer makeComputer(String type) {
		if(type.equals("PC")) {
			 return new PC();
		}
		
		if(type.equals("Server")) {
			return new Server();
		}
		
		return null;
		
		
	}
	
}
