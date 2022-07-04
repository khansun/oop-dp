package super_sub;

public class Main {
	public static void main(String args[]) {
		Sub1 sub1 = new Sub1();
		sub1.echo();
		Sub2 sub2 = new Sub2();
		sub2.echo();
	    Super sup = new Super();
		sup = sub1;
		sup.echo();
	}
}
