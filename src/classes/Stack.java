package classes;


import java.util.Objects;

public class Stack {
    private StackNode top;
    private int elements;

    public Stack(){
        this.top = null;
        this.elements = 0;
    }

    /*Insertar un elemento*/
    public void push(String value){
        StackNode newNode = new StackNode(value, null);

        if(this.top == null){
            this.top = newNode;
        } else {
            newNode.setNext(top);
            this.top = newNode;
        }

        this.elements++;
    }

    /*Sacar un elemento*/
    public String pop(){
        String value = this.top.getValue();
        this.top = this.top.getNext();
        this.elements--;
        return value;
    }

    /*Contar el número de elementos*/
    public int size(){
        return this.elements;
    }

    public boolean hasNext(){
        return this.top != null;
    }

    public void clear(){
        this.top = null;
    }

    /*Comprobar si un elemento esta en la estructura*/
    public boolean findElement(String text){
        if(this.top != null){
            while(this.top != null){
                if(Objects.equals(this.top.getValue(), text)){
                    return true;
                }
                this.pop();
            }
        }
        return false;
    }

    /*Mostrar el siguiente elemento que se sacaría*/
    public String getLast(){
        return this.top.getValue();
    }

    /*Mostrar contenido de la estructura*/
    public void print() {
        if (this.elements == 0)
            return;
        String value = this.pop();
        print();
        System.out.print(value + ", ");
        this.push(value);
    }
}