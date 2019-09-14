package com.somitsolutions.java.FactoryPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComputerFactory factory = ComputerFactory.getFactory();
		
		Computer PC = factory.makeComputer("PC");
		Computer Server = factory.makeComputer("Server");

	}

}
