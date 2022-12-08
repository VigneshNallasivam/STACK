package com.oops.basics;

public class StackPop 
{
	LinkedList list = new LinkedList();
	public void push(Object data)
	{
		list.addNodeLast(data);
	}
	public void pop()
	{
		list.deleteNodeFirst();
	}
	public void display()
	{
		list.display();
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Stack and Queue Data structure");
		StackPop stack = new StackPop();
		stack.push(56);
		stack.push(30);
		stack.push(70);
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
	}
}
