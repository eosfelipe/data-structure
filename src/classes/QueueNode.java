package classes;

public class QueueNode {
    private Object item;
    private QueueNode next;

    public QueueNode(Object item,QueueNode next){
        super();
        this.next = next;
        this.item = item;
    }

    public QueueNode getNext(){
        return next;
    }

    public void setNext(QueueNode next){
        this.next = next;
    }

    public Object getItem(){
        return item;
    }

    public void setItem(Object item){
        this.item = item;
    }
}
