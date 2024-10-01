
public class Busca {
    private static int contador;

    public static int getContador() {
        return contador;
    }

    public static int buscaSequencial(int vet[], int key) {
        contador = 0;
        for (int i = 0; i < vet.length; i++) {
            contador++;
            if(key == vet[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int buscaBinaria(int vet[], int key) {
        int inicio = 0;
        int fim = vet.length - 1;
        int meio;

        contador = 0;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            contador++;
            if(vet[meio] == key) {
                return meio;
            }
            contador++;
            if(key < vet[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }
}