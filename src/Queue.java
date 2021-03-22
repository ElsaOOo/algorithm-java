import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {

  private class Node {
    Item item;
    Node next;
  }
  //    指向最早添加的节点链接
  private Node first;
  //    指向最近添加的节点链接
  private Node last;
  //    队列节点个数
  private int N;

  public boolean isEmpty() {
    return this.first == null;
  }

  public int size() {
    return this.N;
  }

  public void enqueue(Item item) {
    //      向表尾添加元素
    Node oldlast = this.last;
    Node last = new Node();
    last.item = item;
    last.next = null;
    if (this.isEmpty()) {
      this.first = last;
    } else {
      oldlast.next = last;
    }
    this.N = this.N + 1;
  }

  public Item dequeue() {
    //    从表头删除元素
    Item item = this.first.item;
    this.first = this.first.next;
    if (this.isEmpty()) {
      this.last = null;
    }
    this.N = this.N - 1;
    return item;
  }

  @Override
  public Iterator<Item> iterator() {
    return null;
  }
}
