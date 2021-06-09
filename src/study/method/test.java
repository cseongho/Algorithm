package study.method;

import java.util.Collections;
import java.util.PriorityQueue;

public class test {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		pq.add(2);pq.add(12);pq.add(13);

		System.out.println(pq);
		pq.remove();
		System.out.println(pq);

	}

}
