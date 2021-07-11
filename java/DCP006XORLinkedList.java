public class DCP006XORLinkedList {
  /*
   * An XOR linked list is a more memory efficient doubly linked list. Instead of
   * each node holding next and prev fields, it holds a field named both, which is
   * an XOR of the next node and the previous node. Implement an XOR linked list;
   * it has an add(element) which adds the element to the end, and a get(index)
   * which returns the node at index.
   * 
   * If using a language that has no pointers (such as Python), you can assume you
   * have access to get_pointer and dereference_pointer functions that converts
   * between nodes and memory addresses.
   */

  public class Node {
    public int val;
    public int both;

    public Node(int val) {
      this.val = val;
      this.both = 0;
    }
  }

  private Node head;
  private Node tail;

  public DCP006XORLinkedList() {
    this.head = this.tail = null;
  }

  public void add(int element) {
    Node node = new Node(element);
    if (this.head == null) {
      this.head = this.tail = node;
    } else {
      node.both = getPointer(this.tail);
      this.tail.both = this.tail.both ^ getPointer(node);
      this.tail = node;
    }
  }

  public Node get(int idx) {
    Node head = this.head;
    int prev = 0;
    for (int i = 0; i < idx; i++) {
      int next = head.both ^ prev;
      if (next != 0) {
        prev = getPointer(head);
        head = dereferencePointer(next);
      }
    }
    return head;
  }

  /*
   * These two functions bellow are not real, these don't do anything. We are just
   * assuming getPointer() return a memory address, And dereferencePointer()
   * return an Object in the given memory location
   */
  private int getPointer(Node node) {
    return 0;
  }

  private Node dereferencePointer(int address) {
    return null;
  }

  public static void main(String[] args) {
    DCP006XORLinkedList xll = new DCP006XORLinkedList();
    xll.add(1);
    xll.add(2);
    xll.add(3);
    xll.add(4);
  }
}
