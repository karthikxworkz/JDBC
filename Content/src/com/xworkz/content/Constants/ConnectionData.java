package com.xworkz.content.Constants;

public enum ConnectionData {
	
	URl("jdbc:mysql://localhost:3306/Content"),
	USERNAME("root"),
	PASSWORD("Xworkzodc@123");
		
		private String value;
		
		ConnectionData(String value) {
			this.value=value;
		}
		

		public String getValue() {
			return value;
		}
		


}
