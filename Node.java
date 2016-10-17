// *Boris caraballo Linked list Hw
** Node creation and class
public class Node {
  String value;
  Node next;
  Node prev;
  
  public Node(String val);
  {
    this(val,null,null);
  }
  
  public Node(String val,Node n,Node p)
  {
    value=val;
    next=n;
    prev=p;
  }
  
  public String getData() {
    return value;
  }
  
  public void setData(String value) {
    this.value=value;
  }
  
  Public Node getNext(){
    return next;
  }
  
  public void setNext(Node next) {
    this.next=next;
  }
}
    
  
