package opx;
import java.util.Scanner;

public class arithmaric {
	
    private static Scanner inp;
	private static int ans;
	public static void main(String[] args)
    {
        System.out.println("Enter a number followed by an operator then another number to calculate:");
        inp = new Scanner(System.in);
        char choose;        
        int num1,num2;
        num1 = inp.nextInt();
        choose = inp.next().charAt(0);
        num2 = inp.nextInt();
        switch (choose){
        case '+':
            System.out.println(add( num1,num2));
            break;
        case '-':
            System.out.println(sub( num1,num2));
            break;      
        case '*':
            System.out.println(mult( num1,num2));
            break;
        case '/':
            System.out.println(div( num1,num2));
            break;
            default:
                System.out.println("Unsupported Operation\n");
 }

}
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }
	public static int getAns() {
		return ans;
	}
	public static void setAns(int ans) {
		arithmaric.ans = ans;
	}

}