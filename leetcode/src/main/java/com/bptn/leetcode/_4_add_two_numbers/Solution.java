package com.bptn.leetcode._4_add_two_numbers;

public class Solution {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		Solution sol = new Solution();

		ListNode add = sol.addTwoNumbers(l1, l2);

		printList(add);
	}

//	this method is used to print out the contents of the ListNode
	public static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val);
			if (head.next != null) {
				System.out.print(" -> ");
			}
			head = head.next;
		}
		System.out.println(); // move to next line after printing
	}

//	this method is used to add two numbers inside a ListNode 
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
//		Create a temporary head for our final Linkedlist
		ListNode temp = new ListNode(0);
		
//		Set the pointer or iterator to traverse the linked list
		ListNode curr = temp;
		
//		create a variable to hold the carryover value
		int carryOver = 0;
		
//		Traverse the linked list as long as the nodes are not null
		while (l1 != null || l2 != null) {
			
//			create two variables x and y to hold the current value in l1 and l2 respectively
			int x, y;
			
//			if l1 is not null assign the current value to x, if not assign 0
			if(l1 != null) {
				x = l1.val;
			}else {
				x = 0;
			}
			
//			if l2 is not null assign the current value to y, if not assign 0
			if(l2 != null) {
				y = l2.val;
			}else {
				y = 0;
			}
			
//			calculate the sum of x,y and the carryover value and assign it to the sum variable
			int sum = x + y + carryOver;
			
//			calculate the carryover number by dividing the sum by 10 and assign it to the carryOver variable
			carryOver = sum / 10;
			
//			Assign the remainder of dividing the sum by 10 to the curr.next (the next ListNode in curr)
			curr.next = new ListNode(sum % 10);
			
//			Change the current pointer to the next ListNode
			curr = curr.next;
			
//			if l1 is not empty move to the next ListNode
			if (l1 != null) {
				l1 = l1.next;
			}
			
//			if l2 is not empty move to the next ListNode
			if (l2 != null) {
				l2 = l2.next;
			}
		}

//		After the while loop concludes, if the carryOver is greater than 0, add it as the final ListNode
		if (carryOver > 0) {
			curr.next = new ListNode(carryOver);
		}

//		finally, return the temp.next
		return temp.next;

	}

}
