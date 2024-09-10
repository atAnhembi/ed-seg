package exercicio;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        Robo robo = new Robo(10);

        System.out.println("Informe a coordenada x, y DESTINO:");
        x = scanner.nextInt();
        y = scanner.nextInt();

        robo.setTrajeto(new Position(0, 0),new Position(x, y) );

        boolean movendo = true;
        while (movendo) {
            System.out.println("Informe a coordenada x, y:");
            x = scanner.nextInt();
            y = scanner.nextInt();

            movendo = robo.mover(new Position(x, y));
        }

        System.out.println("Fim");
        scanner.close();
    }
}
