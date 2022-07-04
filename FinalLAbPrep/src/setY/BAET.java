package setY;

import java.util.ArrayList;

class BAET{
	int num;
	char op;
	ArrayList<BAET> children = new ArrayList<BAET>(2);
	public BAET(int num) {
		this.num = num;
		// TODO Auto-generated constructor stub
	}
	public BAET(char op) {
		this.op = op;
	}
	 void addNode(BAET newnode) {
		children.add(newnode);
		// TODO Auto-generated method stub	
	}
	 int getValue(BAET node) {
		 if(children.isEmpty())
			 return num;
		 else 
			 return evaluation(node);
	 }
	private int evaluation(BAET node) {
		int a = children.get(0).getValue(node);
		int b = children.get(1).getValue(node);
		if (node.op == '+') {
			return a+b;
		}
		else if (node.op=='-') {
			return a-b;
		}
		else if(node.op == '/') {
			return a/b;
		}
		else if(node.op == '*'){
			 return a*b;
		}
		else {
			 return 0;
		}
	}
	 
}