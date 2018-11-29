package Queue;

import java.util.*;

public class QueueClass {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		//add elemnets
		for(int i =0;i<5;i++) {
			q.add(i);
		}
		System.out.println(q);
		int removedel = q.remove();
		System.out.println(removedel);
		System.out.println(q);
		System.out.println(q.peek());
	}

}
