package com.xworkz.jdbc.Runner;

public class FanRunner {
  public static void main(String[] args) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	}catch(ClassNotFoundException o) {
		o.printStackTrace();
	}
  }
}
