package student.info;

import java.io.File;
import java.util.Scanner;

public class Data {
	public static void main(String[] args) {
		int iut17 = 630;
		int[] stdID = new int [iut17];
		int[] stdIDgrade = new int [iut17];
		String[] stdName = new String [iut17];
		int[] age = new int [iut17];
		String[] bloodGRP = new String [iut17];
		String[] deptName = new String [iut17];
		int[] facultyCount = new int [iut17];
		String[] homeTown = new String [iut17];
		String[] contactNo = new String [iut17];
		double[] gpa1 = new double [iut17];
		double[] gpa2 = new double [iut17];
		double[] cgpa = new double [iut17];
		int con;
		int i=0;
		Scanner input = new Scanner(System.in);
		try {
			File stdDB = new File("student.txt");
			Scanner sheet = new Scanner (stdDB);
			while (sheet.hasNext()) {
				stdID[i] = sheet.nextInt();
				stdName[i] = sheet.next();
				age[i] = sheet.nextInt();
				bloodGRP[i] = sheet.next();
				deptName[i] = sheet.next();
				facultyCount[i] = sheet.nextInt();
				homeTown[i] = sheet.next();
				contactNo[i] = sheet.next();
				i=i+1;
			}
			File gradeSheet = new File("grades.txt");
			Scanner nextSheet = new Scanner (gradeSheet);
			i=0;
			while(nextSheet.hasNext()) {
				stdIDgrade[i] = nextSheet.nextInt();
				gpa1[i]=nextSheet.nextDouble();
				gpa2[i]=nextSheet.nextDouble();
				cgpa[i]=(gpa1[i]+gpa2[i])/2;
				i=i+1;
			}
			sheet.close();
			nextSheet.close();
		}
		catch(Exception e) {
			System.out.println("Exception: "+e);
		}
		System.out.println("\nEnter student id: ");
		con = input.nextInt();
		for(i=0;i<stdID.length;i++) {
			if(stdID[i]==con) {
				System.out.println("Student ID: "+stdID[i]);
				System.out.println("Name: "+stdName[i]);
				System.out.println("Age: "+age[i]);
				System.out.println("Blood Group: "+bloodGRP[i]);
				System.out.println("Home town: "+homeTown[i]);
				System.out.printf("CGPA: %.2f", cgpa[i]);
			}
		}
	}
}
