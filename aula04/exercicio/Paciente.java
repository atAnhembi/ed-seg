package exercicio;

public class Paciente {
    private String nome;
    private int idade;
    
    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // retorna uma cópia do objeto
    public Paciente copy() {
        return new Paciente(nome, idade);
    }

    @Override
    public String toString() {
        return "Paciente: " + nome + ", (" + idade + ")";
    }
}
