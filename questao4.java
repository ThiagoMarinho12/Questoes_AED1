public Node find(Object item) {
    Node atual = head;

    while (atual != null) {
        if (atual.item.equals(item)) {
            return atual;
        }
        atual = atual.next;
    }

    return null;
}

public void insertAfter(Node x, Object item) {
    if (x == null) return;

    Node novo = new Node(item);
    novo.next = x.next;
    x.next = novo;
}
