public class Main {
    public static void main(String[] args) {
        ArvoreABB arvore = new ArvoreABB();

        arvore.add(5);
        arvore.add(4);
        arvore.add(8);
        arvore.add(2);
        arvore.add(2);
        arvore.add(12);
        arvore.add(10);

        System.out.println(arvore.inOrder());
    }
}
