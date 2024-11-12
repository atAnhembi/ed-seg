public class App {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        grafo.addVertice("v1");
        grafo.addVertice("v2");
        grafo.addVertice("v3");
        grafo.addVertice("v4");

        grafo.addAresta("v1", "v2");
        grafo.addAresta("v1", "v3");
        grafo.addAresta("v2", "v1");
        grafo.addAresta("v3", "v4");

        System.out.println(grafo.arestas("v1"));
        System.out.println(grafo.arestas("v5"));
        System.out.println(grafo.arestas());
    }
}
