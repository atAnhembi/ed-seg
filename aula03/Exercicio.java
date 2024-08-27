import java.util.Scanner;

public class Exercicio {

    // Inverter a ordem das palavras em uma frase
    public static void main(String[] args) {
        Pilha p;
        String frase;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a frase:");
        frase = entrada.nextLine();

        String[] palavras = frase.split(" ");
        
        int maiorPalavra = 0;
        for (String palavra : palavras) {
            if(palavra.length() > maiorPalavra){
                maiorPalavra = palavra.length();
            }
        }
        p = new Pilha(maiorPalavra);

        System.out.println("Invertida:");

        for (String palavra : palavras) {
            palavra.chars().forEach((letra)->{
                p.empilhar(letra);
            }); 
            while (!p.estaVazia()) {
                System.out.print((char) p.desempilhar());
            }
            System.out.print(" ");
        }

        entrada.close();
    }
}
