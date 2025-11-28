package integercontainers;

import integercontainers.IntegerStack;
import integercontainers.IntegerQueue;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== PRUEBA DE INTGER STACK ===");
        IntegerStack stack = new IntegerStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Contenido de la pila: " + stack);
        System.out.println("Primer elemento: " + stack.top());
        System.out.println("Search 20: " + stack.search(20));
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pila tras pop: " + stack);
        System.out.println("Size: " + stack.size());

        System.out.println("\n=== PRUEBA DE INTEGER QUEUE ===");
        IntegerQueue queue = new IntegerQueue();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        System.out.println("Contenido de la cola: " + queue);
        System.out.println("Seek: " + queue.seek());
        System.out.println("Search 2: " + queue.search(2));
        System.out.println("Remove: " + queue.remove());
        System.out.println("Queue tras remove: " + queue);
        System.out.println("Size: " + queue.size());
    }
}
