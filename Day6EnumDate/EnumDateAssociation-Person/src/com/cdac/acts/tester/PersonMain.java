package com.cdac.acts.tester;

import java.util.Scanner;
import java.text.ParseException;
import java.util.Date;

//importing package classes
import com.cdac.acts.address.*;
import com.cdac.acts.dateutil.*;
import com.cdac.acts.enums.GenderEnum;
import com.cdac.acts.person.*;


public class PersonMain {

	public static Address getAddressFromUser(Scanner sc) {
		
		System.out.println("Enter Address Line 1: ");
		String line1 = sc.nextLine();
		System.out.println("Enter Address Line 2: ");
		String line2 = sc.nextLine();
		System.out.println("Enter City: ");
		String city = sc.nextLine();
		System.out.println("Enter PinCode ");
		String pin = sc.nextLine();
		
		Address address = new Address(line1, line2, city, pin);
		return address;
					
	}
	
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//Take Entries for Person Object Fields:
		System.out.println("Please enter Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Adhar Card No.: ");
		String adhar = sc.nextLine();
		
		System.out.println("Enter Gender from M ,F and O: ");
		String strgender = sc.nextLine();
		GenderEnum gender = GenderEnum.valueOf(strgender);
		
		System.out.println("Enter Date of Birth in dd/MM/yyyy format: ");
		String strdate = sc.nextLine();
		Date dob = DateUtil.getDate(strdate);
		
		Address permAddress = getAddressFromUser(sc);
		
		Person p1 = new Person(name, adhar, gender, dob, permAddress);
		
		System.out.println(p1);
		
		

	}

}
