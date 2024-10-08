
package br.anhembi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClientDAOMySQL implements ClientDAO {
    private static String url = "jdbc:mysql://localhost:3306/bd_cliente_uam";
    private static String user = "profuam"; // root
    private static String password = "aula"; //salavo2021

    @Override
    public Client create(Client client) {
        String sql = "insert into cliente (nome, email) values (?,?);";
        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        )
        {
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getEmail());
            preparedStatement.executeUpdate();
            return client;

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }

    @Override
    public Client findById(int id) {
        String sql = "select * from cliente where id = ?;";
        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        )
        {
            preparedStatement.setInt(1, id);
            ResultSet result =  preparedStatement.executeQuery();
            if(result.next()) {
                int idClient = result.getInt("id");
                String nomeCliente = result.getString("nome");
                String emailCliente = result.getString("email");

                Client client = new Client(idClient, nomeCliente, emailCliente);
                return client;
            }
            return null;

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Client> findAll() {
        String sql = "select * from cliente;";
        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        )
        {
            ResultSet result =  preparedStatement.executeQuery();
            List<Client> clients = new ArrayList<>();

            while(result.next()) {
                int idClient = result.getInt("id");
                String nomeCliente = result.getString("nome");
                String emailCliente = result.getString("email");

                Client client = new Client(idClient, nomeCliente, emailCliente);
                clients.add(client);
                
            }
            return clients;

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }

    @Override
    public boolean deleteById(int id) {
        String sql = "delete from cliente where id = ?;";
        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        )
        {
            preparedStatement.setInt(1, id);
            int qtde = preparedStatement.executeUpdate();
            return qtde > 0;

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }

}
