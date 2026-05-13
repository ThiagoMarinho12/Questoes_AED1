public class Node {
    public Object item;
    public Node next;

    public Node(Object item) {
        this.item = item;
        this.next = null;
    }

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}

public class ListaSimples {
    private Node head;

    public ListaSimples() {
        this.head = null;
    }

    public void insertFirst(Object item) {
        Node novo = new Node(item);
        novo.next = head;
        head = novo;
    }

    public void imprimir() {
        Node atual = head;
        while (atual != null) {
            System.out.print(atual.item + " -> ");
            atual = atual.next;
        }
        System.out.println("null");
    }
}
