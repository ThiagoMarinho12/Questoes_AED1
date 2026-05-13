public void remove(int indice) {
    if (indice < 0 || indice >= tamanho)
        throw new IndexOutOfBoundsException("Indice invalido: " + indice);

    for (int i = indice; i < tamanho - 1; i++) {
        dados[i] = dados[i + 1];
    }

    tamanho--;
}
