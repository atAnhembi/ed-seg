public class Main {
    public static void main(String[] args) {
        MyList<String> lista = new MyList<>();

        lista.add("Pipoca");
        lista.add("Esfirra");
        lista.add("Café");

        try {
            lista.removeLast();
            System.out.println(lista.show());
            lista.removeLast();
            System.out.println(lista.show());
            lista.removeLast();
            System.out.println(lista.show());
            lista.removeLast();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
