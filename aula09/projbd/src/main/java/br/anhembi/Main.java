package br.anhembi;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClientDAO clientDAO = new ClientDAOMySQL();

        Client client1 = new Client(0, "Emerson", "emerson@email.com");
        Client client2 = new Client(0, "Paduan", "paduan@email.com");

        Client newCliente = clientDAO.create(client1);
        
        if(newCliente != null) {
            System.out.println("Inserção realizada");
        }else {
            System.out.println("Falha na inserção");
        }
        
        newCliente = clientDAO.create(client2);
        if(newCliente != null) {
            System.out.println("Inserção realizada");
        }else {
            System.out.println("Falha na inserção");
        }

        System.out.println("Busca:");
        Client clientFound = clientDAO.findById(1);

        System.out.println(clientFound);

        System.out.println("Todos:");
        
        List<Client> clients = clientDAO.findAll();

        for (Client clients2 : clients) {
            System.out.println(clients2);
        }

        if(clientDAO.deleteById(2)){
            System.out.println("Removido");
        } else {
            System.out.println("Não removido");
        }
    }
}