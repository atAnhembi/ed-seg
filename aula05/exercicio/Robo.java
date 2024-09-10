package exercicio;

public class Robo {
    private Pilha<Position> caminho;
    private Position destino;

    public Robo(int caminhoMaximo) {
        caminho = new Pilha<>(caminhoMaximo);
    }

    public void setTrajeto(Position origem, Position destino) throws Exception {
        if(!caminho.estaVazia()){
            throw new Exception("Destino deve ser indicado antes de iniciar o movimento.");
        }
        this.destino = destino;
        caminho.empilhar(origem);
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
