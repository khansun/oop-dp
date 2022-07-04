package cgheen;


public class Printer {
		int num;
		double pi;
		String messi;
		
	  void printf(int xzu){
		  num = xzu;
		  System.out.println(num+" is integer type");
	  }
	  void printf(double b) {
		  pi = b;
		  System.out.println(pi+" is double type");
	}
	 double printf(String rex)
	{	messi = rex;
		System.out.println(messi+ " is string type");
		return 0;  
	}
	}
