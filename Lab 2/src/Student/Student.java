package Student;

public class Student {
	int ID;
	String Name;
	float CGPA;
	String Address;
	boolean Luck;
	float[] result = new float[6];
	
	public void getter(int ID, String Name, String Address, boolean Luck, float CGPA) {
		this.ID = ID;
		this.Address = Address;
		this.Name = Name;
		this.Luck = Luck;
		this.CGPA = CGPA;
		
	}
	public float setter() {
		return(result[0]+result[1]+result[2]+result[3]+result[4]+result[5])/6;
	}

}
