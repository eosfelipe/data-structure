package classes;


import java.util.Objects;

public class Stack {
    private StackNode top;
    private int elements;

    public Stack(){
        top = null;
        elements = 0;
    }

    /*Insertar un elemento*/
    public void push(String value){
        StackNode newNode = new StackNode(value, null);

        if(top == null){
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }

        elements++;
    }

    /*Sacar un elemento*/
    public String pop(){
        String value = top.getValue();
        top = top.getNext();
        elements--;
        return value;
    }

    /*Contar el número de elementos*/
    public int size(){
        return this.elements;
    }

    public boolean hasNext(){
        return top != null;
    }

    public void clear(){
        top = null;
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
        System.out.print(value + " ");
        this.push(value);
    }
}