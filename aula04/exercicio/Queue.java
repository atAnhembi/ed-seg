package exercicio;

public class Queue {
    private Paciente data[];
    private int end;

    public Queue(int size) {
        data = new Paciente[size];
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

    // public Paciente peek() {
    //     if(isEmpty()) {
    //         return null;
    //     }
    //     return data[0];
    // }

    // evita retornar uma referência que pode ser
    // usada para alterar um objeto na fila
    public Paciente peek() {
        if(isEmpty()) {
            return null;
        }
        return data[0].copy();
    }

    public String peekInfo() {
        if(isEmpty()) {
            return "";
        }
        return data[0].toString();
    }

    public boolean enqueue(Paciente paciente) {
        if(isFull()) {
            return false;
        }
        data[end++] = paciente;
        return true;
    }

    public Paciente dequeue() {
        if(isEmpty()) {
            return null;
        }
        Paciente paciente = data[0];
        for (int i = 0; i < end - 1; i++) {
            data[i] = data[i+1];
        }
        end--;
        return paciente;
    }

    public String show() {
        String dataQueue = "";

        for (int i = 0; i < end; i++) {
            dataQueue += data[i] + "\n";
        }
        return dataQueue;
    }
}
