import java.util.HashMap;

public class Grafo {
    private HashMap<String, Vertice> vertices;

    public Grafo() {
        vertices = new HashMap<>();
    }

    public void addVertice(String name) {
        vertices.put(name, new Vertice(name));
    }

    public boolean addAresta(String verticeOrigem, String verticeDestino) {
        if(vertices.containsKey(verticeOrigem) && vertices.containsKey(verticeDestino)) {
            vertices.get(verticeOrigem).addAdjascentes(verticeDestino);
            return true;
        }
        return false;
    }

    public String arestas(String verticeName) {
        Vertice vertice = vertices.get(verticeName);
        if(vertice != null){
            return vertice.arestas();
        }
        return "-";
    }

    public String arestas() {
        String out = "";

        for (Vertice vertice: vertices.values()) {
            out += vertice.arestas() + "\n";
        }
        return out;
    }


}
 