package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class main {

	public static void main(String[] args)
	{
		PriorityQueue<String> pqueue = new PriorityQueue<String>(new comp());
		pqueue.add("Hello");
		pqueue.add("HI");
		pqueue.add("Once Upon a Time...");
		System.out.println(pqueue.poll());
		pqueue.add("George VIII, long live the KING");
		pqueue.add("e. e. cummings");
		System.out.println(pqueue.poll());
		System.out.println(pqueue.poll());
		System.out.println(pqueue.poll());
	}


// YAAKOV WAS HERE part 2
}
