/*
a) Inserção no meio

No array dinâmico, inserir no meio exige deslocar todos os elementos
à direita da posição para abrir espaço. Isso custa O(n).

Na lista encadeada, se já tivermos a referência do nó anterior,
a inserção custa apenas O(1), pois basta ajustar os ponteiros.

b) Acesso por índice

O array é mais rápido, pois permite acesso direto via índice (O(1)).
Já na lista encadeada, é necessário percorrer nó por nó até chegar
à posição desejada, custando O(n).

c) Josephus com array

Seria possível usar um array, mas cada remoção exigiria deslocamento
dos elementos restantes (O(n)). Como várias remoções são feitas,
o custo total seria maior.

Na lista circular, a remoção é O(1) porque basta ajustar os ponteiros,
tornando a solução mais eficiente para esse problema.
*/
