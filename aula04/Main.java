public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(3);

        System.out.println("Fila vazia? " + queue.isEmpty());

        System.out.println("Inseriu: "+ queue.enqueue(12));
        System.out.println("Inseriu: "+ queue.enqueue(13));
        System.out.println("Inseriu: "+ queue.enqueue(14));
        System.out.println("Inseriu: "+ queue.enqueue(15));
        
        System.out.println("Fila: " + queue.show());
        
        System.out.println("Removeu: " + queue.dequeue());
        System.out.println("Removeu: " +queue.dequeue());

        System.out.println("Fila: " + queue.show());
    }
}
