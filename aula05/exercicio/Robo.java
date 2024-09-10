package exercicio;

public class Robo {
    private Pilha<Position> caminho;
    private Position destino;


    public Robo(int caminhoMaximo) {
        caminho = new Pilha<>(caminhoMaximo);
    }

    public void setOrigem(Position position) throws Exception {
        if(!caminho.estaVazia()){
            throw new Exception("Já está em movimento");
        }
        caminho.empilhar(position);
    }

    public void setDestino(Position position) {
        destino = position;
    }

    public boolean mover(Position position) throws Exception{
        if(position.equals(destino)) {
            System.out.println("Destino atingido. Iniciando a volta.");
            while (!caminho.estaVazia()) {
                System.out.println(caminho.desempilhar());
            }
            return false;
        }
        caminho.empilhar(position);
        return true;
    }
}