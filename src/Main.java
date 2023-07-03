import classes.Person;
import classes.Queue;
import classes.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("felipe");
        stack.push("luis");
        stack.push("ronaldo");
        stack.push("oscar");
        stack.push("dunosusa");

        System.out.println(stack.size());
        stack.print();
        System.out.println();

        System.out.println(stack.getLast());

        /*if(stack.findElement("ronaldos")){
            System.out.println("El elemento si esta en la pila");
        }else {
            System.out.println("El elemento no esta en la pila");
        }
        System.out.println(stack.size());
        stack.print();*/

        Person person1 = new Person(1,"Juan",25);
        Person person2 = new Person(2,"Luis",22);
        Person person3 = new Person(3,"David",34);
        Person person4 = new Person(4,"Ronaldo",35);
        Person person5 = new Person(5,"Mike",40);

        Queue people = new Queue();
        people.push(person1);
        people.push(person2);
        people.push(person3);
        people.push(person4);
        people.push(person5);


        Person item = null;
        while(people.hasNext()){
            item = (Person) people.pop();
            System.out.println(item.getName());
        }
    }
}