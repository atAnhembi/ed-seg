public class MyList<T> {
    private Node<T> first, last;

    public boolean isEmpty() {
        return first == null;
    }

    // insere no final da lista
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            newNode.setNext(first);
            first = newNode;
        }
    }

    public T removeFirst() throws Exception {
        Node<T> aux = first;

        if (isEmpty()) {
            throw new Exception("Erro: empty");
        }

        first = first.getNext();

        if (first == null) { // este era o último elemento
            last = null;
        }

        return aux.getData();
    }

    public T removeLast() throws Exception {
        Node<T> aux = first;

        if (isEmpty()) {
            throw new Exception("Erro: empty");
        }

        if (first == last) {
            T data = last.getData();
            first = last = null;
            return data;
        }

        while (aux.getNext() != last) {
            aux = aux.getNext();
        }

        T data = last.getData();
        last = aux;
        last.setNext(null);

        return data;
    }

    public String show() {
        if (isEmpty()) {
            return "Empty";
        }
        String result = "";
        Node<T> aux = first;
        while (aux != null) {
            result += aux.getData() + " ";
            aux = aux.getNext();
        }
        return result;
    }

    // *** Exercícios ***

    public boolean exists(T data) {
        return false;
    }

    public int size() {
        return 0;
    }

    public void add(T data, int position) {

    }

    public boolean remove(T data) {
        return false;
    }

    public T remove(int position) {
        return null;
    }

    public void set(T data, int position) {

    }

    public T get(int position) {
        return null;
    }
}
