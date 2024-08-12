package com.testcore;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

class Student implements Comparable<Student>{
	
	private int id;
	private String name;
	
	public Student(int id, String name) {
		 this.id = id;
		 this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student s) {
		
		return s.name.compareTo(name);
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		
		if(this==obj)
			return true;
		if(obj==null || getClass()!=obj.getClass())
			return false;
		Student student = (Student) obj;
		return id==student.id && Objects.equals(name, student.name);
	}
	
}

public class CollectionTest {

	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list.add("Hello");
//		list.add(0, "Welcome");
//		list.add("Bye");
//		list.sort((a, b)->b.compareTo(a));
//		System.out.println(list);
//		System.out.println(list.contains("Bye"));
		
//		Stack<Integer> stack = new Stack<Integer>();
//		stack.push(55);
//		stack.push(23);
//		stack.push(67);
//		System.out.println(stack);
//		stack.add(10);
//		System.out.println(stack);
//		stack.pop();
//		System.out.println(stack);
//		System.out.println(stack.peek());
//		System.out.println(stack);
//		
//		Queue<String> queue = new ArrayDeque<String>();
//		queue.add("Hi");
//		queue.offer("Hello");
//		queue.offer("Welcome");
//		System.out.println(queue);
//		queue.poll();
//		System.out.println(queue);
//		System.out.println(queue.element());
		
//		Queue<Integer> queue = new PriorityQueue<Integer>((a,b)->b-a);
//		queue.offer(50);
//		queue.offer(20);
//		queue.offer(10);
//		queue.offer(40);
//		queue.offer(30);
//		System.out.println(queue);
//		queue.offer(10);
//		System.out.println(queue);
		
//		Set<String> set = new TreeSet<String>((a,b)->b.compareTo(a));
//		set.add("Welcome");
//		set.add("Hello");
//		set.add("Bye");
//		System.out.println(set);
//		for(String s:set)
//			System.out.println(s);
		
//		Set<Student> set = new TreeSet<Student>();
		Set<Student> set = new HashSet<Student>();
		set.add(new Student(1, "Ram"));
		set.add(new Student(2, "Hari"));
		set.add(new Student(3, "Amit"));
		set.add(new Student(3, "Amit"));
		for(Student s:set)
			System.out.println(s.toString());
		
		Student s1 = new Student(4, "Rahul");
		Student s2 = new Student(5, "Rahul");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

}
