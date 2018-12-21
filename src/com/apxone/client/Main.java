package com.apxone.client;

import com.apxone.beans.Computer;
import com.apxone.beans.Server;
import com.apxone.factory.ComputerFactory;
import com.apxone.factory.ComputerType;

public class Main {
	public static void main(String[] args) {
		Computer computer = ComputerFactory.createComputer(ComputerType.PC, "16GM", "1TB", "Intel Core I7");
		System.out.println(computer);
		
		Server Server = (Server)ComputerFactory.createComputer(ComputerType.SERVER, "32GM", "100TB", "Intel Core I7");
		System.out.println(Server);
	}
}
