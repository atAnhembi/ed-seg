public class Queue<T> {
    private T data[];
    private int end;

    @SuppressWarnings("unchecked")
    public Queue(int size) {
        data = (T[]) new Object[size];
        end = 0;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean isFull() {
        return end == data.length;
    }

    public int size() {
        return end;
    }

    public T peek() {
        if(isEmpty()) {
            return null;
        }
        return data[0];
    }

    public boolean enqueue(T value) {
        if(isFull()) {
            return false;
        }
        data[end++] = value;
        return true;
    }

    public T dequeue() throws Exception {
        if(isEmpty()) {
            // 
            throw new Exception("Fila vazia");
        }
        T value = data[0];
        for (int i = 0; i < end - 1; i++) {
            data[i] = data[i+1];
        }
        end--;
        return value;
    }

    public String show() {
        String dataQueue = "";

        for (int i = 0; i < end; i++) {
            dataQueue += data[i] + " ";
        }
        return dataQueue;
    }
}
