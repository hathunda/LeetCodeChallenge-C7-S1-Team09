package com.bptn.leetcode._5_merged_sorted_list;

public class Solution {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);

		Solution sol = new Solution();

		ListNode merged = sol.mergeTwoLists(l1, l2);

		printList(merged);
	}

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

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		// temporary list note just to hold the head of the linked list and so we can
		// traverse it
		ListNode temp = new ListNode(0);

		// set the pointer or iterator to traverse the linked list
		ListNode current = temp;

		// we traverse the linked list as long as the nodes are not null
		while (list1 != null && list2 != null) {

			// if list1 is smaller, val of list1 will be the next node in the new linked
			// list
			if (list1.val <= list2.val) {
				current.next = list1;
				list1 = list1.next;
			} else {
				// if list2 is smaller, val of list2 will be the next node in the new linked
				// list
				current.next = list2;
				list2 = list2.next;
			}

			current = current.next; // move the pointer to the next node
		}

		// handle the remaining nodes in l1, if they exist by appending them to the
		// current list
		if (list1 != null) {
			current.next = list1;
			list1 = list1.next;
		}

		// handle the remaining nodes in l2, if they exist by appending them to the
		// current list
		if (list2 != null) {
			current.next = list2;
			list2 = list2.next;
		}

		// this returns next node of the temp node which is the starting point (head) of
		// the merged list
		return temp.next;
	}

}
