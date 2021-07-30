import java.util.ArrayList;

public class ListNode {
  public int val;
  public ListNode next;

  public ListNode(int val) {
    this.val = val;
    this.next = null;
  }
  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public void printNodes() {
    ArrayList<Integer> listNodes = new ArrayList<>();
    ListNode current = this;

    while (current != null) {
      listNodes.add(current.val);
      current = current.next;
    }
    System.out.println(listNodes);
  }
}
