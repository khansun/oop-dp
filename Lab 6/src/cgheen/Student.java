package cgheen;

public class Student {
	String name;
	int id,ref;
	int marks[];
	double j = 0;
	double cg;
	  void setName(String newName) {
		name = newName;
	}
	 void setID(int newID) {
		id = newID;
	}
	 void setMarks(int newMarks[]) {
		marks = newMarks;
	}
	public int getID() {
		return id;
	}
	
	
	public double getCG() {
		for (int i = 0  ; i<marks.length ; i++) {
		if(marks[i]>=80) {
			j+= 4;
		}
		else if (marks[i]>=75) {
			j+=3.75;
		}
		else if(marks[i]>=70) {
			j+=3.5;
		}
		else if (marks[i]>=65) {
			j+=3.25;
		}
		else if(marks[i]>=60) {
			j+=3;
		}
		else {
			ref++;
				
		}		
	}
		if(ref==0) {
			cg = j/marks.length;		
		}
		else {cg=0;
			System.out.println("Reffered Subjects: " + ref );
		}
		return cg; 

	}
	
	
}