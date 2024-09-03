package exercicio;

public class Exercicio {
public static void main(String[] args) {
    Queue pacientes = new Queue(3);

    pacientes.enqueue(new Paciente("Ana", 21));
    pacientes.enqueue(new Paciente("Bernardo", 22));
    pacientes.enqueue(new Paciente("Carla", 23));
    pacientes.enqueue(new Paciente("Daniel", 24));

    System.out.println("Filha cheia? " + pacientes.isFull());

    System.out.println("Fila:");
    System.out.println(pacientes.show());

    Paciente proximo = pacientes.peek();
    proximo.setIdade(33);
    
    System.out.println("Removeu: "+pacientes.dequeue());

    System.out.println("Fila:");
    System.out.println(pacientes.show());



}
}
