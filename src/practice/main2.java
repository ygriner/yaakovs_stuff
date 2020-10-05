package practice;

import java.util.PriorityQueue;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pqueue = new PriorityQueue<String>(new comp<String>());
		pqueue.add("Hello");
		pqueue.add("HI");
		pqueue.add("Once Upon a Time...");
		System.out.println(pqueue.poll());
		pqueue.add("George VIII, long live the KING");
		pqueue.add("e. e. cummings");
		System.out.println(pqueue.poll());
		System.out.println(pqueue.poll());
		System.out.println(pqueue.poll());
		
		System.out.println(Harmonic(5));
	}
	
	public static double Harmonic(double n) {
		if(n == 0) {
			return -1;
		}
		else if( n== 1) {
			return 1;
		}
		else {
			return ((1/n) + Harmonic(n-1));
		}
	}

}
