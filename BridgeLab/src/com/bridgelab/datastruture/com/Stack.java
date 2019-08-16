package com.bridgelab.datastruture.com;

public class Stack<T> {
	int capacity=10;
	private Object[] stack=new Object[capacity]; 
	private int top=0;
	
	
	public void push(T data) {
		// checks for capacity
		if(top==capacity) {
			expand();
		}
		// puts data in stack
		stack[top]=data;
		top++;
	}
	public T pop() {
		if(isEmpty()) {
			System.out.println(" can not pop, stack is empty");
			return null;
		}else {
			T data=(T) stack[--top];
			stack[top]=null;
			return data;
		}
		
		
	}
	public T peek()
	{
		return(T) stack[top];
	}
	public boolean isEmpty() {
		return top==0;
	}
	public int size() {
		return top;
	}
	
	
	private void expand() {
		Object[] newStack = new Object[capacity * 2];
		System.arraycopy(stack, 0, newStack, 0, top);
		capacity *= 2;
		stack = newStack;
	}

	/**
	 * Function to give elements in stack as string
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{ ");
		for (int i = 0; i < top; i++) {
			sb.append(stack[i]);
			sb.append(", ");
		}
		sb.append("}");
		return sb.toString();
	}
	
	
}
