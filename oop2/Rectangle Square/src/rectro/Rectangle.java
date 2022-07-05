
package rectro;

import java.util.Scanner;

public class Rectangle {
	private static Scanner input;
	public static void main(String[] args) {
	int a,b,c,d;
	input = new Scanner(System.in);
	System.out.println("a=");
	a = input.nextInt();
	System.out.println("b=");
	b = input.nextInt();
	System.out.println("c=");
	c = input.nextInt();
	System.out.println("d=");
	d = input.nextInt();
	rectifier(a,b,c,d);
	}
	public static void rectifier(int a, int b,int c, int d)
    {
		if(a==b&&b==c&&c==d) {
			System.out.println("Square");
		}
		else {
			System.out.println("Not Square");
		}
	}
    
}