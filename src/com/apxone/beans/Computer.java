package com.apxone.beans;

public abstract class Computer {

	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	public String toString() {
		return "RAM : "+getRAM()+"\nHOD : "+getHDD()+"\nCPU : "+getCPU();
	}
	
}
