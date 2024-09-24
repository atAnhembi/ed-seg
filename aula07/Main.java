public class Main {
    public static void main(String[] args) {
        MyList<String> lista = new MyList<>();

        lista.insert("A");
        lista.insert("B");
        lista.insert("C");
        lista.insert("D");

        System.out.println(lista + " size : " + lista.size());

        while (!lista.isEmpty()) {
            System.out.println("removendo: "+ lista.removeLast());
            System.out.println(lista + " size : " + lista.size());
        }

    }
}
