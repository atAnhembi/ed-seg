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
        arvore.add(11);

        System.out.println(arvore.preOrder());
        System.out.println(arvore.inOrder());
        System.out.println(arvore.posOrder());
        System.out.println("achou 2:" + arvore.existis(2));
        System.out.println("achou 20:" + arvore.existis(20));
    }
}
