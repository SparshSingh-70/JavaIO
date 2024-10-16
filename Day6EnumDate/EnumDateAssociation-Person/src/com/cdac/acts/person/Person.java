package com.cdac.acts.person;

//importing Packages
import java.util.Date;
import com.cdac.acts.address.Address;
import com.cdac.acts.dateutil.DateUtil;
import com.cdac.acts.enums.*;

public class Person {
	/*Create Person class with basic details like 
		 * addharNumber, name, date of birth, address ( use Address class for this). 
		 * Find out whether the person is born before 15th August 1947.
		 */
		private int pId;
		private String pAdhar;
		private  String pName;
		private GenderEnum pGender;
		private Date pDob;
		private Address permAddress;
		
		private static int idGenerator = 0;
		public Person(String name, String adhar, GenderEnum gender, Date dob, Address address) {
			pId = ++idGenerator;
		 	pAdhar = adhar;
		 	pName = name;
		 	pGender = gender;
		 	pDob = dob;
		 	permAddress = address;
		}
		
		
		public int getpId() {
			return pId;
		}
		
		
		
		public String getpAdhar() {
			return pAdhar;
		}
		public void setpAdhar(String pAdhar) {
			this.pAdhar = pAdhar;
		}
		public String getpName() {
			return pName;
		}
		public void setpName(String pName) {
			this.pName = pName;
		}
		public Date getpDob() {
			return pDob;
		}
		public void setpDob(Date pDob) {
			this.pDob = pDob;
		}
		
		public Address getPermAddress() {
			return permAddress;
		}

		public void setPermAddress(Address permAddress) {
			this.permAddress = permAddress;
		}
		
		public GenderEnum getpGender() {
			return pGender;
		}
		
		public void setpGender(GenderEnum gender) {
			this.pGender = gender;
		}
		
		
		@Override
		public String toString() {
			return "Person [pId=" + pId + 
					", Name= " + pName + 
					", AdharNo.= " + pAdhar + 
					", pGender= " + pGender.getValue() +
					", Dob= " + DateUtil.getFormattedDate(pDob) + 
					 permAddress.toString() + "]";
		}
		
		
		
		
		
	
}
