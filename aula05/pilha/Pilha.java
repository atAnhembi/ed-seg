package pilha;
public class Pilha <T> {
    private T dados[];
    private int topo;

    @SuppressWarnings("unchecked")
    public Pilha(int tamanho) {
        dados = (T[]) new Object[tamanho];
        topo = 0;
    }

    public boolean  estaVazia() {
        return topo == 0;
    }

    public boolean estaCheia() {
        return topo == dados.length;
    }

    public boolean empilhar(T valor) {
        if(estaCheia()){
            return false;
        }
        dados[topo++] = valor;
        return true;
    }

    public T desempilhar() {
        if(estaVazia()) {
            return null;
        }
        return dados[--topo];
    }

    @Override
    public String toString() {
        String dadosPilha = "";
        for (T valor : dados) {
            dadosPilha += valor + ",";
        }
        return dadosPilha;
    }
}
