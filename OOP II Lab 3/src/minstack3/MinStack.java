package minstack3;

import java.io.PushbackInputStream;
import java.util.Stack;

public class MinStack {
	Stack<Integer> stk = new Stack<>();
	Stack<Integer> ms = new Stack<>();
	void push(int n) {
		stk.push(n);
	}
	
}

