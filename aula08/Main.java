public class Main {
    public static void main(String[] args) {
        final int TAM_MAX = 2_000_000_000;
        int vet[] = new int[TAM_MAX];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = i;
        }

        int key = (int) (Math.random() * TAM_MAX);

        long inicio = System.currentTimeMillis();
        int resp = Busca.buscaSequencial(vet, key);
        long termino = System.currentTimeMillis();
        System.out.println("Achou " + key + " em " + resp);
        System.out.println("Tempo: " + (termino - inicio) + "ms");
        System.out.println("Número de comparações: " + Busca.getContador());

        inicio = System.currentTimeMillis();
        resp = Busca.buscaBinaria(vet, key);
        termino = System.currentTimeMillis();
        System.out.println("Achou " + key + " em " + resp);
        System.out.println("Tempo: " + (termino - inicio) + "ms");
        System.out.println("Número de comparações: " + Busca.getContador());
    }
}
