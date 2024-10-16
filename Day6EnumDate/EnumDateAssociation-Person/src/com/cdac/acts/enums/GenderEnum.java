package com.cdac.acts.enums;

public enum GenderEnum {
		M("Male"),
		F("Female"),
		O("Other");
		
		private String str;
		
		private GenderEnum(String str) {
			this.str = str;
		}
	
		public String getValue() {
			return str;
		}
}
