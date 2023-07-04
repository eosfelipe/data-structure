import classes.Person;
import classes.Queue;
import classes.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("***** Stack implementation ******");
        System.out.println("Se tiene una torre de discos de musica apilados de diferentes artistas, se requiere reproducir el de RBD");
        Stack stack = new Stack();
        stack.push("Alejandor Sanz");
        stack.push("León Larregui");
        stack.push("José José");
        stack.push("RBD");
        stack.push("David Guetta");

        System.out.println("Tamaño de la pila: " + stack.size() + " elementos");
        System.out.println("Elementos dentro de la estructura: ");
        stack.print();
        System.out.println();
        System.out.println("El elemento de la cima es: "+stack.getLast());
        System.out.println("Validar si el elemento <<RBD>> esta en la estructura: ");
        if(stack.findElement("RBD")){
            System.out.println("El elemento si esta en la pila");
        }else {
            System.out.println("El elemento no esta en la pila");
        }
        /*System.out.println(stack.size());
        stack.print();*/

        System.out.println();
        System.out.println();
        System.out.println("***** Queue implementation ******");

        Person person1 = new Person(1,"Juan",25);
        Person person2 = new Person(2,"Luis",22);
        Person person3 = new Person(3,"David",34);
        Person person4 = new Person(4,"Ronaldo",35);
        Person person5 = new Person(5,"Mike",40);

        Queue people = new Queue();
        people.enqueue(person1);
        people.enqueue(person2);
        people.enqueue(person3);
        people.enqueue(person4);
        people.enqueue(person5);

        System.out.println("Abre el banco y llegan " + people.size() + " personas a realizar depositos en ventanilla, la caja atiende conforme vayan llegando: ");

        Person nextPerson = (Person) people.getNext();
        System.out.println("Siguiente en turno: "+ nextPerson.getName());

        Person item = null;
        while(people.hasNext()){
            item = (Person) people.dequeue();
            System.out.println("Orden de atención para caja: " + item.getName() +" "+ item.getAge() + " años");
        }
    }
}