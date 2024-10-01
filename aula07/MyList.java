public class MyList<T> {
    Node<T> first, last;
    private int size;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<T>(data);
        size++;

        if (isEmpty()) {
            first = last = newNode;
            return;
        }

        last.setNext(newNode);
        newNode.setPrev(last);
        last = newNode;
    }

    public T removeFirst() {
        // 1. lista vazia
        if (isEmpty()) {
            return null;
        }

        T data = first.getData();
        first = first.getNext();

        // 2. só tem um nó
        if (first == null) {
            last = null;
        } else {
            // 3. caso geral
            first.setPrev(null);
        }

        size--;
        return data;
    }

    public T removeLast() {
        if (isEmpty()) {
            return null;
        }

        T data = last.getData();

        last = last.getPrev();
        if (last == null) {
            first = null;
        } else {
            last.setNext(null);
        }

        size--;
        return data;
    }

    public String toString() {
        if (isEmpty()) {
            return "Lista Vazia";
        }

        String dataString = first.getData().toString();
        Node<T> aux = first.getNext();

        while (aux != null) {
            dataString += "-" + aux.getData();
            aux = aux.getNext();
        }
        return dataString;
    }

    // retorna o valor que está em uma certa posição, sem remover
    public T get(int position) {
        if(position <= 0 || position > size){
            return null;
        }
        int count = 1;
        Node<T> aux = first;
        while (count < position) {
            aux = aux.getNext();
            count++;
        }
        return aux.getData();
    }

    // Verifica se um dado está presente na lista
    public boolean exists(T data) {
        return false;
    }

    // adiciona um dado em uma posição específica
    // precisa validar a posição
    public void add(T data, int position) {

    }

    // remove um data caso ele exista na lista
    public boolean remove(T data) {
        return false;
    }

    // remove o dado que estiver em uma determinada posição
    public T remove(int position) {
        return null;
    }

    // altera o dado que está em uma posição
    public void set(T data, int position) {

    }

}
