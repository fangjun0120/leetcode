package jfang.leetcode.solution;

import java.util.Stack;

public class Solution155 {

	public class MinStack {
	    private Stack<Integer> mins = new Stack<Integer>();
	    private Stack<Integer> values = new Stack<Integer>();
	    
	    public void push(int x) {
	        values.push(x);
	        if (mins.size() == 0 || mins.peek() >= x)
	            mins.push(x);
	    }

	    public void pop() {
	        if (values.peek().equals(mins.peek()))
	            mins.pop();
	        values.pop();
	    }

	    public int top() {
	        return values.peek();
	    }

	    public int getMin() {
	        return mins.peek();
	    }
	}
}
