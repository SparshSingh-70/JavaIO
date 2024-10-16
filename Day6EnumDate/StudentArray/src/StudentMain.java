import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import com.cdac.acts.courseenum.CourseEnum;
import com.cdac.acts.utils.DateUtils;

public class StudentMain {
	
	public static void main(String[] args) throws ParseException {
		Student [] sarr = new Student[15];
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		int count  = 0;
//		
		
//		System.out.println("Enter Student Name: ");
//		String name = sc.nextLine();
//		System.out.println("Enter Marks: ");
//		double marks = sc.nextDouble();
//		//Date
//		sc.nextLine();
//		System.out.println("Enter DOB in dd/MM/yyyy format: ");
//		String strdate = sc.nextLine();
//		Date dob = DateUtils.getDate(strdate);
//		//Course
//		System.out.println("Enter Course Name from (PG_DAC/AI/DITIS/DESD/VLSI)");
//		String strcourse = sc.nextLine();
//		CourseEnum course = CourseEnum.valueOf(strcourse);
//		
//		Student st = new Student(name,marks,course,dob);
////		st.toString();
//		System.out.println(st);
		
		
		
		
		
		
		
		do {
			System.out.println("-------- MENU --------");
			System.out.println("1. Add New Student");
			System.out.println("2. Display Student by roll no. ");
			System.out.println("3. Sort Students by Marks");
			System.out.println("4. Exit (Sayonara) ");
			
			System.out.println("Enter Your Choice: ");
			choice = sc.nextInt();
			
			
			switch (choice) {
			case 1:
 				{
					sc.nextLine();
					System.out.println("Enter Student Name: ");
					String name = sc.nextLine();
					System.out.println("Enter Marks: ");
					double marks = sc.nextDouble();
					//Date
					sc.nextLine();
					System.out.println("Enter DOB in dd/MM/yyyy format: ");
					String strdate = sc.nextLine();
					Date dob = DateUtils.getDate(strdate);
					//Course
					System.out.println("Enter Course Name from (PG_DAC/AI/DITIS/DESD/VLSI)");
					String strcourse = sc.nextLine();
					CourseEnum course = CourseEnum.valueOf(strcourse);
					
					sarr[count] = new Student(name,marks,course,dob);
					System.out.println("Student Added Successfully --> ");
					System.out.println(sarr[count]);
					count++;
				}
				break;
			case 2:
				{
					System.out.println("Please Enter Roll Number of Student: ");
					int roll = sc.nextInt();
					boolean found = false;
					for(int i = 0 ; i < count && !found ; i++) {
						if(sarr[i].getRno() == roll) {
							System.out.println("Student Found --->");
							System.out.println(sarr[i]);
							found = true;
						}else {
							System.out.println("Student Not found !");
						}
					}
				}
				break;
			case 3:
				{
				
					for(int i = 0 ; i < count - 1  ; i++) {
						for(int j = 0; j < count - i - 1; j++) {
							if(sarr[j].getMarks() < sarr[j+1].getMarks()) {
								Student temp = sarr[j];
								sarr[j] = sarr[j+1];
								sarr[j+1] = temp;
							}
						}
					}
					System.out.println("Student Sorted ---->");
					for(int i = 0; i < count ; i++) {
						System.out.println(sarr[i]);
					}
				}
			case 4:{
				break;
				}
			default:
				System.out.println("Invalid Choice, please enter again");
				break;
			}
		}while(choice != 4);
		
		sc.close();
		
	}
}
