public class Queue {
    private int data[];
    private int end;

    public Queue(int size) {
        data = new int[size];
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

    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return data[0];
    }

    public boolean enqueue(int value) {
        if(isFull()) {
            return false;
        }
        data[end++] = value;
        return true;
    }

    public int dequeue() {
        if(isEmpty()) {
            return -1;
        }
        int value = data[0];
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
