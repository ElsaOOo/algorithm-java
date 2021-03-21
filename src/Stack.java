import java.util.Iterator;

/** 下压堆栈 用链表实现 */
public class Stack<Item> implements Iterable<Item> {

  private class Node {
    //        定义了节点的嵌套类
    Item item;
    Node next;
  }

  private Node first; // 栈顶，最近添加的元素
  private int N; // 元素数量

  public boolean isEmpty() {
    //        栈是否为空
    return first == null;
  }

  public int size() {
    //        栈中的元素个数
    return N;
  }

  public void push(Item item) {
    //    向栈中添加元素
    this.N = this.N + 1;
    Node oldFirst = this.first;
    this.first = new Node();
    this.first.item = item;
    this.first.next = oldFirst;
  }

  public Item pop() {
    //    栈顶删除元素
    Item item = this.first.item;
    this.first = this.first.next;
    this.N = this.N - 1;
    return item;
  }

  @Override
  public Iterator<Item> iterator() {
    return null;
  }
}
