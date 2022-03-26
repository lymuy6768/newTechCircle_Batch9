package day36_Collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListTest {

	public static void main(String[] args) {
		Queue<Integer> list= new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.offer(4);
		
		System.out.println(list);
		
		list.remove();
		
		System.out.println(list);
		
		list.peek();
		System.out.println(list.peek());
		
		list.poll();
		System.out.println(list.peek());
		System.out.println(list);
		System.out.println(list.peek());
		
		LinkedList <Double> list2 = new LinkedList<>();
		
		list2.add(1.3);
		list2.add(3.3);
		list2.addFirst(0.1);
		list2.addLast(4.2);
		
		System.out.println(list2);
		
		Queue<Integer> nums = new PriorityQueue<>();
		nums.offer(2);
		nums.offer(3);
		nums.add(4);
		nums.addAll(Arrays.asList(5,6,78));
		
		System.out.println(nums.peek());
		System.out.println(nums.element());
		
		nums.remove();//remove 1st element as FIFO
		System.out.println(nums);
		
		nums.poll();//remove 2nd one as FIFO
		System.out.println(nums);
		
		

	}

}
