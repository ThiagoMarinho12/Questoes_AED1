public class Josephus {
    public static void main(String[] args) {

        int N = 6;
        int M = 3;

        Node primeiro = new Node(1);
        Node atual = primeiro;

        for (int i = 2; i <= N; i++) {
            Node novo = new Node(i);
            atual.next = novo;
            atual = novo;
        }

        atual.next = primeiro; // fecha o círculo

        Node anterior = atual;
        atual = primeiro;

        System.out.println("Ordem de eliminacao:");

        while (atual.next != atual) {

            for (int i = 1; i < M; i++) {
                anterior = atual;
                atual = atual.next;
            }

            System.out.println(atual.item);

            anterior.next = atual.next;
            atual = anterior.next;
        }

        System.out.println("\nSobrevivente: " + atual.item);
    }
}
