package classes;

public class StackNode {
    private String value;
    private StackNode next;

    public StackNode(String value, StackNode next){
        super();
        this.value = value;
        this.next = next;
    }

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

    public StackNode getNext(){
        return next;
    }

    public void setNext(StackNode next){
        this.next = next;
    }
}