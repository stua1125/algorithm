package leetCode;

public class InsertionSortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode head4 = new ListNode(3, null);
		ListNode head3 = new ListNode(1, head4);
		ListNode head2 = new ListNode(2, head3);
		ListNode head1 = new ListNode(4, head2);
		
		insertionSortList(head1);
	}
	
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
    
	public static ListNode insertionSortList(ListNode head) {
        
        ListNode copyHead = new ListNode();
        copyHead.next = head;
        
        while(copyHead.next != null) {
        	ListNode tmp;

         	if(copyHead.next.val > copyHead.next.next.val) {
         		tmp = copyHead.next;
         		tmp.next = copyHead.next.next.next;
         		copyHead.next = copyHead.next.next;
         		copyHead.next.next = tmp;
         	}
         	
             System.out.println("copyHead next: " + copyHead.next.val);
             System.out.println("copyHead next next: " + copyHead.next.next.val);
        
             copyHead = copyHead.next;
        }
        
        return head;
    }

}
