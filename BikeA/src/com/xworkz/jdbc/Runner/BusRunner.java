package com.xworkz.jdbc.Runner;

public class BusRunner {
	
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");	
	}catch(ClassNotFoundException o) {
		o.printStackTrace();
	}
	}
}
