package integercontainers;

/**
 * Implementación dinámica de una cola (FIFO) de enteros.
 */
public class IntegerQueue {

    // Nodo interno
    private class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
        }
    }

    private Node head; // cabecera
    private Node tail; // final de la cola
    private int size;

    /** Inserta un elemento al final de la cola */
    public void insert(Integer i) {
        Node n = new Node(i);
        if (tail == null) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    /** Extrae el elemento de la cabecera */
    public Integer remove() {
        if (head == null) return null;

        Integer val = head.data;
        head = head.next;

        if (head == null) tail = null;

        size--;
        return val;
    }

    /** Devuelve el elemento de la cabecera sin extraerlo */
    public Integer seek() {
        if (head == null) return null;
        return head.data;
    }

    /** Número de elementos almacenados */
    public int size() {
        return size;
    }

    /** Busca un elemento en la cola */
    public boolean search(Integer i) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(i)) return true;
            current = current.next;
        }
        return false;
    }

    /** Muestra el contenido de la cola */
    @Override
    public String toString() {
        if (head == null) return "Empty queue";

        StringBuilder sb = new StringBuilder();
        Node current = head;

        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }

        return sb.toString().trim();
    }
}
