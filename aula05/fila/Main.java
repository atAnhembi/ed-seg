public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(3);

        System.out.println("Fila vazia? " + queue.isEmpty());

        System.out.println("Inseriu: " + queue.enqueue(12));
        // System.out.println("Inseriu: " + queue.enqueue(13));
        // System.out.println("Inseriu: " + queue.enqueue(14));
        // System.out.println("Inseriu: " + queue.enqueue(15));

        System.out.println("Fila: " + queue.show());

        try {
            System.out.println("Removeu: " + queue.dequeue());
            System.out.println("Removeu: " + queue.dequeue());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fila: " + queue.show());
    }
}
