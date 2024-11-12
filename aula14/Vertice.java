import java.util.ArrayList;
import java.util.List;

public class Vertice {
    private String name;
    private List<String> adjascentes;

    public Vertice(String name) {
        this.name = name;
        adjascentes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAdjascentes(String name) {
        adjascentes.add(name);
    }

    public String arestas() {
        String out = "";

        for (String vertice : adjascentes) {
            out += "(" + name + "," + vertice + ") ";
        }

        return out;
    }

    public String adjascentes() {
        String out = name + ": ";

        for (String vertice : adjascentes) {
            out += vertice + " - ";
        }
        return out;
    }
}