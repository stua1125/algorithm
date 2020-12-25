package leetCode;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode resultNode = new ListNode();

		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(4, node1);
		ListNode node3 = new ListNode(2, node2);
		
		ListNode nodeA = new ListNode(4);
		ListNode nodeB = new ListNode(6, nodeA);
//		ListNode nodeB = new ListNode(6);
		ListNode nodeC = new ListNode(5, nodeB);
		
		resultNode = addTwoNumbers(node3, nodeC);
		System.out.println("");
		System.out.println("==============");
		printNodes(resultNode);
	}

	/*
	 * ll max < next = null
	 */
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// 기본 생성자 resultNode을 생성ㅎ면 해당 객체의 .val 멤버 변수는 0으로 자동 초기화
		ListNode resultNode = new ListNode();
		ListNode head = new ListNode();
		head.next = resultNode;
		
		// 첫 노드 입력이라는 신호 변수
		boolean firstFlag = true;
		// 자라 올림이 발생햇따는 뜻의 신호 변수 ( 다음자리수애 1을 더 해준다 )
		boolean carryFlag = false;
		
		/*
		 * l1과 l2 둘중 하나라도 널이 아니거나 혹은 자리올림수(carryFlag)가 발생했을떄 실행되는 반복문
		 */
		while(l1 != null || l2 != null || carryFlag) {
			int sumVal = 0;
			
			// 자리올림수가 있을 경우 +1 처리
			if(carryFlag) {
				carryFlag = false;
				sumVal += 1;
			}
			
			if(l1 != null) {
				sumVal += l1.val;
				l1 = l1.next;
			}
			if(l2 != null) {
				sumVal += l2.val;
				l2 = l2.next;
			}
			
			// 10이상 숫자 일경우 carry 발생, 10을 나눈 후 나머지만 node에 insert 
			if(sumVal >= 10) {
				carryFlag = true;
				sumVal = sumVal%10;
			}
		
// 			reverse insert			
//			if(firstFlag) {
//				ListNode tempNode = new ListNode(sumVal);
//				resultNode = tempNode;
//				firstFlag = false;
//			} else {
//				ListNode tempNode = new ListNode(sumVal, resultNode);
//				resultNode = tempNode;
//			}
			
//          nomal insert
//			do~while문 대신 첫번째 노드입력할때 firstFlag 변수로 분개처리(헤드의 다음 첫 노드 val 설정)
			if(firstFlag) {
				resultNode.val = sumVal;
				firstFlag = false;
			} else {
				ListNode tempNode = new ListNode(sumVal);
				resultNode.next = tempNode;
				resultNode = resultNode.next;
			}
		}
		
 		return head.next;
    }
	
	public static void printNodes(ListNode l1) { 
		while(l1 != null) {
			System.out.println(l1.val);
			l1 = l1.next;
		}
	}
}
