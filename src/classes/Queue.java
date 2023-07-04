package classes;

public class Queue {
    private QueueNode start;
    private QueueNode end;
    private int elements;

    public Queue() {
        this.start = null;
        this.end = null;
        this.elements = 0;
    }

    public void enqueue(Object item){
        QueueNode node = new QueueNode(item,null);
        if(this.start == null){
            this.start = node;
        } else {
            this.end.setNext(node);
        }
        this.end = node;
        this.elements++;
    }

    public Object dequeue() {
        Object item = null;
        if (this.elements > 0) {
            item = this.start.getItem();
            this.elements--;
            this.start = this.start.getNext();
        }
        return item;
    }

    public boolean hasNext(){
        boolean next = false;
        if(this.start != null){
            next = true;
        }
        return next;
    }

    public int size(){
        return this.elements;
    }

    public Object getNext(){
        return this.start.getItem();
    }
}
