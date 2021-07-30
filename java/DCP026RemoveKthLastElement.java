public class DCP026RemoveKthLastElement {
  public static void removeKthLastFromLinkedList(ListNode head, int k) {
    ListNode fast = head;
    ListNode slow = head;

    // Move fast up by k
    for (int i = 0; i < k; i++) {
      fast = fast.next;
    }
    ListNode prev = null;
    // Move both fast and slow until fast reaches end of the list
    while (fast != null) {
      prev = slow;
      slow = slow.next;
      fast = fast.next;
    }
    prev.next = slow.next;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1,
        new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));

    head.printNodes();
    removeKthLastFromLinkedList(head, 3);
    head.printNodes();
  }
}
