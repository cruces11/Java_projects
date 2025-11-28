package integercontainers;

/**
 * Implementación dinámica de una pila (LIFO) de enteros.
 */
public class IntegerStack {

    // Nodo interno
    private class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
        }
    }

    private Node top;  // cima de la pila
    private int size;  // número de elementos

    /** Apila un elemento en la cima */
    public void push(Integer i) {
        Node n = new Node(i);
        n.next = top;
        top = n;
        size++;
    }

    /** Desapila un elemento: devuelve null si está vacía */
    public Integer pop() {
        if (top == null) return null;
        Integer value = top.data;
        top = top.next;
        size--;
        return value;
    }

    /** Devuelve el elemento de la cima sin extraerlo */
    public Integer top() {
        if (top == null) return null;
        return top.data;
    }

    /** Número de elementos almacenados */
    public int size() {
        return size;
    }

    /** Busca un elemento en la pila */
    public boolean search(Integer i) {
        Node current = top;
        while (current != null) {
            if (current.data.equals(i)) return true;
            current = current.next;
        }
        return false;
    }

    /** Muestra el contenido de la pila */
    @Override
    public String toString() {
        if (top == null) return "Empty stack";

        StringBuilder sb = new StringBuilder();
        Node current = top;

        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }

        return sb.toString().trim();
    }
}
