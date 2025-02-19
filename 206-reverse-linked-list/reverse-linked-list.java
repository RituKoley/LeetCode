/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
	1       ->     2   ->                 3     ->  null
		prev ->   curr  ->   (start)>   next->curr.next-> prev(1)
		3->null
		null->1
		1->2
		2->3
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null, next = null, currNode = head;
        while(currNode != null){
            next = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = next;
        }
        return prevNode;
    }
}