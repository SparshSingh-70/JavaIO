package com.cdac.acts.address;

public class Address {
	
		/*Create Person class with basic details like 
		 * addharNumber, name, date of birth, address ( use Adress class for this). 
		 * Find out whether the person is born before 15th August 1947.
		 */
	
		private String Line1;
		private String Line2;
		private String City;
		private String PinCode;
		
		public Address(String l1, String l2, String city, String pin) {
			Line1 = l1;
			Line2 = l2;
			City = city;
			PinCode = pin;
		}

		
		public String getLine1() {
			return Line1;
		}

		public void setLine1(String line1) {
			Line1 = line1;
		}

		public String getLine2() {
			return Line2;
		}

		
		public void setLine2(String line2) {
			Line2 = line2;
		}

		public String getCity() {
			return City;
		}

		public void setCity(String city) {
			City = city;
		}

		public String getPinCode() {
			return PinCode;
		}

		public void setPinCode(String pinCode) {
			PinCode = pinCode;
		}


		@Override
		public String toString() {
			return "  Address [Line1=" + Line1 + ", Line2=" + Line2 + ", City=" + City + ", PinCode=" + PinCode + "]";
		}
	
		
	
}
