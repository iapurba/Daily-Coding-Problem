public class DCP020LinkedListIntersection {
  private int findLength(ListNode a) {
    if (a == null) {
      return 0;
    }
    return 1 + findLength(a.next);
  }

  public ListNode FindIntersectNode(ListNode a, ListNode b) {
    int aLength = findLength(a);
    int bLength = findLength(b);

    // Keeping two pointers at the head of each node 
    ListNode currentA = a;
    ListNode currentB = b;

    // Advancing pointer of longer node by their difference 
    if (aLength > bLength) {
      for (int i = 0; i < (aLength - bLength); i++) {
        currentA = currentA.next;
      }
    } else {
      for (int i = 0; i < (bLength - aLength); i++) {
        currentB = currentB.next;
      }
    }

    while (currentA != currentB) {
      currentA = currentA.next;
      currentB = currentB.next;
    }
    return currentA;
  }

  public static void main(String[] args) {
    ListNode a = new ListNode(1);
    a.next = new ListNode(2);
    a.next.next = new ListNode(3);
    a.next.next.next = new ListNode(4);

    ListNode b = new ListNode(7);
    b.next = new ListNode(6);
    b.next.next = new ListNode(7);
    b.next.next.next = a.next;

    DCP020LinkedListIntersection x = new DCP020LinkedListIntersection();

    System.out.println(x.FindIntersectNode(a, b).val);
    
  }
}
