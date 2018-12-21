package com.apxone.factory;

import com.apxone.beans.Computer;
import com.apxone.beans.PC;
import com.apxone.beans.Server;

public class ComputerFactory {

	public static Computer createComputer(ComputerType type, String ram, String hdd, String cpu) {
		Computer computer = null;
		switch(type) {
		case PC :
			computer = new PC(ram, hdd, cpu);
			break;
		case SERVER :
			computer = new Server(ram, hdd, cpu);
		}
		return computer;
	}
}
