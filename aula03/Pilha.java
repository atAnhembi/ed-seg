public class Pilha {
    private int dados[];
    private int topo;

    public Pilha(int tamanho) {
        dados = new int[tamanho];
        topo = 0;
    }

    public boolean  estaVazia() {
        return topo == 0;
    }

    public boolean estaCheia() {
        return topo == dados.length;
    }

    public boolean empilhar(int valor) {
        if(estaCheia()){
            return false;
        }
        dados[topo++] = valor;
        return true;
    }

    public int desempilhar() {
        if(estaVazia()) {
            return -1;
        }
        return dados[--topo];
    }

    @Override
    public String toString() {
        String dadosPilha = "";
        for (int valor : dados) {
            dadosPilha += valor + ",";
        }
        return dadosPilha;
    }
}
