package pilha;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>(3);

        pilha.empilhar("12");
        pilha.empilhar("13");
        pilha.empilhar("14");
        pilha.empilhar("52");

        System.out.println("Pilha:");
        System.out.println(pilha);

        System.out.println("Desempilhando...");

        while (!pilha.estaVazia()) {
            System.out.println(pilha.desempilhar());
        }
    }
}