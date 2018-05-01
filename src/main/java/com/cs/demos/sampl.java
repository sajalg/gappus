package com.cs.demos;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedList;
import java.util.List;

public class sampl {
	
	public static void main(String[]args){
		LinkedList<String>ll=new LinkedList<String>();
sam obj=new sam(ll);

sam2 lam=(sam2)Proxy.newProxyInstance(sampl.class.getClassLoader(),new Class[]{sam2.class},obj);
lam.add("sajal");
lam.add("gappu");


}
}
interface sam2{
	public void add(String k);
	public void iterate();

}

class t implements sam2{
	LinkedList<String>ll;
public t(LinkedList<String> ll){
	this.ll=ll;
}
	public void add(String k){
		this.ll.add(k);
		
	}
	public void iterate(){
		for(String m:ll){
			System.out.println(m);
		}
	}
}

class sam implements InvocationHandler{
	List ll;
	public sam(List args){
		ll=args;
	}
	@Override
	public Object invoke(Object obj, Method m, Object[]args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		System.out.println("method is being invoked "+m.getName());
		m.invoke(ll, args);
		return null;
		
	}

	
}

class linkedList{
	public node tail,head;
	public linkedList(){
		this.head=null;
		this.tail=this.head;
	}
	
	public void reverse(node node){
		node current=node;
		node last=node.next;
		node previous=null;
		current.next=previous;
		previous=current;
		reverse(last);
	}
	
	public void addNode(int data){
		node nnode=new node(data);
		if(head==null){
			head=nnode;
			tail=head;
		}
		else{
			node traversal=head;
			while(traversal.next!=null){
				traversal=traversal.next;
			}
			traversal.next=nnode;
			tail=traversal.next;
		}
	}
}


class node{
	
	int data;
	node next;
	public node(int data){
		this.data=data;
		this.next=null;
	}
}
